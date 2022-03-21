package br.com.sas.api.controllers;

import br.com.sas.api.dtos.AlunoDto;
import br.com.sas.api.entities.Aluno;
import br.com.sas.api.response.Response;
import br.com.sas.api.services.AlunoService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.Optional;


@Getter
@Setter
@RestController
@NoArgsConstructor
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retorna a consulta do recurso"),
        @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
        @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
})
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {

    private static final Logger log = LoggerFactory.getLogger(AlunoController.class);

    @Autowired
    private AlunoService alunoService;

    @GetMapping(value = "/{email}")
    public ResponseEntity<Response<AlunoDto>> buscarPorEmail(@PathVariable("email") String email) {

        log.info("Buscando aluno por E-mail: {}", email);

        Response<AlunoDto> response = new Response<AlunoDto>();

        Optional<Aluno> aluno = alunoService.buscarPorEmail(email);

        if (!aluno.isPresent()) {
            log.info("Aluno não encontrado para o E-mail: {}", email);
            response.getErrors().add("Aluno não encontrado para o E-mail " + email);
            return ResponseEntity.badRequest().body(response);
        }

        response.setData(this.converterAlunoDto(aluno.get()));
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Response<AlunoDto>> cadastrar(@Valid @RequestBody AlunoDto alunoDto,
                                                                BindingResult result) throws NoSuchAlgorithmException {

        log.info("Cadastrando Aluno: {}", alunoDto.toString());

        Response<AlunoDto> response = new Response<AlunoDto>();

        validarDadosExistentes(alunoDto, result);
        Aluno aluno = this.converterDtoParaAluno(alunoDto, result);

        if (result.hasErrors()) {
            log.error("Erro validando dados de cadastro Aluno: {}", result.getAllErrors());
            result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }

        this.alunoService.persistir(aluno);

        response.setData(this.converterAlunoDto(aluno));
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/{email}")
    public ResponseEntity<Response<AlunoDto>> atualizar(@PathVariable("email") String email,
                                                              @Valid @RequestBody AlunoDto alunoDto, BindingResult result) throws NoSuchAlgorithmException {
        log.info("Atualizando aluno: {}", alunoDto.toString());
        Response<AlunoDto> response = new Response<AlunoDto>();

        Optional<Aluno> aluno = this.alunoService.buscarPorEmail(email);
        if (!aluno.isPresent()) {
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

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Response<String>> remover(@PathVariable("id") Long id) {
        log.info("Removendo aluno: {}", id);
        Response<String> response = new Response<String>();

        Aluno aluno = this.alunoService.buscarPorId(id);

        if (Objects.isNull(aluno)) {
            log.info("Erro ao remover devido ao aluno ID: {} ser inválido.", id);
            response.getErrors().add("Erro ao remover aluno. Registro não encontrado para o id " + id);
            return ResponseEntity.badRequest().body(response);
        }

        this.alunoService.remover(id);
        return ResponseEntity.ok(new Response<String>());
    }

    private void validarDadosExistentes(AlunoDto alunoDto, BindingResult result) {

        Optional<Aluno> aluno = this.alunoService.buscarPorEmail(alunoDto.getEmail());

        this.alunoService.buscarPorEmail(alunoDto.getEmail())
                .ifPresent(alun -> result.addError(new ObjectError("aluno", "Aluno já existente.")));
    }

    private AlunoDto converterAlunoDto(Aluno aluno) {
        AlunoDto alunoDto = new AlunoDto();
        alunoDto.setNome(aluno.getNome());
        alunoDto.setEmail(aluno.getEmail());

        return alunoDto;
    }

    private Aluno converterDtoParaAluno(AlunoDto alunoDto, BindingResult result)
            throws NoSuchAlgorithmException {
            Aluno aluno = new Aluno();
            aluno.setId(alunoDto.getId());
            aluno.setNome(alunoDto.getNome());
            aluno.setEmail(alunoDto.getEmail());

        return aluno;
    }

    private void atualizarDadosAluno(Aluno aluno, AlunoDto alunoDto, BindingResult result)
            throws NoSuchAlgorithmException {
        aluno.setNome(alunoDto.getNome());
        aluno.setEmail(alunoDto.getEmail());

    }

}
