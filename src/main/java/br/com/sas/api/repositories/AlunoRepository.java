package br.com.sas.api.repositories;

import br.com.sas.api.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    void deleteById(Long id);

    Aluno findByNomeOrEmail(String nome, String email);

}
