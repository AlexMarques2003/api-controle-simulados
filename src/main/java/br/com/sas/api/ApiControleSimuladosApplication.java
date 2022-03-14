package br.com.sas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.sas.entities.Aluno;
import br.com.sas.repositories.AlunoRepository;

@SpringBootApplication
public class ApiControleSimuladosApplication {

	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiControleSimuladosApplication.class, args);
		System.out.println("Aplicação no ar");
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args ->{
			Aluno aluno = new Aluno();
			aluno.setNome("Joao");
			
			this.alunoRepository.save(aluno);
			
			List<Aluno> alunos = alunoRepository.findAll();
			alunos.forEach(System.out::println);
			
			Aluno alunoDb = alunoRepository.findByNome("Joao");
			System.out.println("Aluno por ID: " + alunoDb);		
					
		};
	}
	
}
