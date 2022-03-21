package br.com.sas.api.services;

import br.com.sas.api.entities.Aluno;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AlunoService {

    Aluno persistir(Aluno aluno);

    Optional<Aluno> buscarPorEmail(String email);

    Aluno buscarPorId(Long id);

    void remover(Long id);

}
