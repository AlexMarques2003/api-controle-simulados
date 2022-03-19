package br.com.sas.api.repositories;

import br.com.sas.api.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    void deleteById(Long id);


}
