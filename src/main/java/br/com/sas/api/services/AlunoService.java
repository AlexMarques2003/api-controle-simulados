package br.com.sas.api.services;

import java.util.List;
import java.util.Optional;

import br.com.sas.api.entities.Aluno;
import org.springframework.stereotype.Service;

@Service
public interface AlunoService {

    Aluno persistir(Aluno aluno);

    Optional<Aluno> buscarPorEmail(String email);

}
