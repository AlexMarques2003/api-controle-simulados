package br.com.sas.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sas.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	Optional<Aluno> findById(Long id);
	
	Aluno findByNome(String nome);

}
