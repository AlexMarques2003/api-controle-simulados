package br.com.sas.api.services;

import br.com.sas.api.entities.Prova;

import java.util.Optional;

public interface ProvaService {
    /**
     * Persiste uma prova na base de dados.
     *
     * @param prova
     * @return Prova
     */
    Prova persistir(Prova prova);

    /**
     * Busca e retorna uma prova dado uma materia.
     *
     * @param materia
     * @return Optional<Prova>
     */
    Optional<Prova> buscarPorMateria(String materia);

    /**
     * Busca e retorna uma prova por ID.
     *
     * @param id
     * @return Optional<Prova>
     */
    Optional<Prova> buscarPorId(Long id);

}
