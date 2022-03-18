package br.com.sas.api.services;

import br.com.sas.api.entities.Prova;

import java.util.Optional;

public interface ProvaService {

    Prova persistir(Prova prova);

    Optional<Prova> buscarPorMateria(String materia);

    Optional<Prova> buscarPorId(Long id);

}
