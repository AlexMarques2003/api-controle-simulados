package br.com.sas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sas.api.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	Aluno findByNome(String nome);

	default Aluno findByEmail(String email) {
		return null;
	}

}
