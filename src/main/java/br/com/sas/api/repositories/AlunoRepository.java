package br.com.sas.api.repositories;

import br.com.sas.api.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findByEmail(String email);

}
