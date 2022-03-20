package br.com.sas.api.controllers;

import br.com.sas.api.dtos.AlunoDto;
import br.com.sas.api.entities.Aluno;
import br.com.sas.api.response.Response;
import br.com.sas.api.services.AlunoService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<Response<AlunoDto>> bucarTodos() {

        log.info("Buscando todos os alunos.");

        Response<AlunoDto> response = new Response<AlunoDto>();

        Optional<Aluno> aluno = alunoService.buscarTodos();

        if (!aluno.isPresent()) {
            log.info("Alunos não encontrados");
            response.getErrors().add("Alunos não encontrados.");
            return ResponseEntity.badRequest().body(response);
        }

        response.setData(this.converterAlunoDto(aluno.get()));
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/email/{email}")
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

    private AlunoDto converterAlunoDto(Aluno aluno) {
        AlunoDto alunoDto = new AlunoDto();
        alunoDto.setId(aluno.getId());
        alunoDto.setEmail(aluno.getEmail());
        alunoDto.setNome(aluno.getNome());

        return alunoDto;
    }



}
