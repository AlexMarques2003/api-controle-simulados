package br.com.sas.api.services;

import br.com.sas.api.entities.Aluno;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AlunoService {

    Aluno persistir(Aluno aluno);
    Optional<Aluno> buscarPorId(Long id);
    Optional<Aluno> buscarPorNome(String nome);
    Optional<Aluno> buscarPorEmail(String email);

}
