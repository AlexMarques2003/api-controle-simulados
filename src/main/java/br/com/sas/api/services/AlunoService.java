package br.com.sas.api.services;

import br.com.sas.api.entities.Aluno;

import java.util.Optional;

public interface AlunoService {

    /**
     * Persiste um aluno na base de dados.
     *
     * @param aluno
     * @return Aluno
     */
    Aluno persistir(Aluno aluno);

    /**
     * Busca e retorna um aluno por ID.
     *
     * @param id
     * @return Optional<Aluno>
     */
    Optional<Aluno> buscarPorId(Long id);

    /**
     * Busca e retorna um aluno dado um nome.
     *
     * @param nome
     * @return Optional<Aluno>
     */
    Optional<Aluno> buscarPorNome(String nome);

    /**
     * Busca e retorna um aluno dado um e-mail.
     *
     * @param email
     * @return Optional<Aluno>
     */
    Optional<Aluno> buscarPorEmail(String email);





}
