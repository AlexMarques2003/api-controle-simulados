package br.com.sas.api.services;

import br.com.sas.api.entities.Aluno;

import java.util.Optional;

public interface AlunoService {

    Aluno persistir(Aluno aluno);

    Optional<Aluno> buscarPorId(Long id);

    default Optional<Aluno> buscarPorEmail(String email) {
        return null;
    }

}
