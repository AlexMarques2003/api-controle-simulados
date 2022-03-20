package br.com.sas.api.services.impl;

import java.util.List;
import java.util.Optional;

import br.com.sas.api.entities.Aluno;
import br.com.sas.api.repositories.AlunoRepository;
import br.com.sas.api.services.AlunoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService {

    private static final Logger log = LoggerFactory.getLogger(AlunoServiceImpl.class);

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno persistir(Aluno aluno) {
        log.info("Persistindo Aluno: {}", aluno);
        return this.alunoRepository.save(aluno);
    }
    public Optional<Aluno> buscarPorEmail(String email) {
       log.info("Buscando aluno pelo Email {}", email);
        return Optional.ofNullable(this.alunoRepository.findByEmail(email));
    }
    public Optional<Aluno> buscarPorId(Long id) {
        log.info("Buscando Aluno pelo IDl {}", id);
        return this.alunoRepository.findById(id);
    }

}
