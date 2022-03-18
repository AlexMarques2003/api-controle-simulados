package br.com.sas.api.controllers;

import br.com.sas.api.dtos.AlunoDto;
import br.com.sas.api.entities.Aluno;
import br.com.sas.api.response.Response;
import br.com.sas.api.services.AlunoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@RestController
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {

    private static final Logger log = LoggerFactory.getLogger(AlunoController.class);

    @Autowired(required = false)
    private AlunoService alunoService;

    public AlunoController(){

    };

    @GetMapping(value = "/email/{email}")
    public ResponseEntity<Response<AlunoDto>> buscarPorEmail(@PathVariable("email") String email) {
        log.info("Buscando aluno por Email: {}", email);
        Response<AlunoDto> response = new Response<AlunoDto>();
        Optional<Aluno> aluno = alunoService.buscarPorEmail(email);

        if (!aluno.isPresent()) {
            log.info("Aluno não encontrado para o Email: {}", email);
            response.getErrors().add("Aluno não encontrado para o email " + email);
            return ResponseEntity.badRequest().body(response);
        }

        response.setData(this.converterAlunoDto(aluno.get()));
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Response<AlunoDto>> atualizar(@PathVariable("id") Long id,
                                                        @Valid @RequestBody AlunoDto alunoDto, BindingResult result) throws NoSuchAlgorithmException {
        log.info("Atualizando Aluno: {}", alunoDto.toString());

        Response<AlunoDto> response = new Response<AlunoDto>();

        Optional<Aluno> aluno = this.alunoService.buscarPorId(id);
        if (aluno.isEmpty()) {
            result.addError(new ObjectError("aluno", "Aluno não encontrado."));
        }

        this.atualizarDadosAluno(aluno.get(), alunoDto, result);

        if (result.hasErrors()) {
            log.error("Erro validando aluno: {}", result.getAllErrors());
            result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }

        this.alunoService.persistir(aluno.get());
        response.setData(this.converterAlunoDto(aluno.get()));

        return ResponseEntity.ok(response);
    }

    private void atualizarDadosAluno(Aluno aluno, AlunoDto alunoDto, BindingResult result)
            throws NoSuchAlgorithmException {
        aluno.setNome(alunoDto.getNome());

        if (!aluno.getEmail().equals(alunoDto.getEmail())) {
            this.alunoService.buscarPorEmail(alunoDto.getEmail())
                    .ifPresent(alun -> result.addError(new ObjectError("email", "Email já existente.")));
            aluno.setEmail(alunoDto.getEmail());
        }

    }

    private AlunoDto converterAlunoDto(Aluno aluno) {
        AlunoDto alunoDto = new AlunoDto();
        alunoDto.setId(aluno.getId());
        alunoDto.setNome(aluno.getNome());
        alunoDto.setEmail(aluno.getEmail());

        return alunoDto;
    }

}
