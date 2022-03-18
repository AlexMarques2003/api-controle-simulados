package br.com.sas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sas.api.entities.Aluno;
import org.springframework.stereotype.Repository;

import javax.servlet.ServletException;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    void deleteById(Long id);


}
