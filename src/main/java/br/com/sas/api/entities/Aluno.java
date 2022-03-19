package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString 
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="alunos")
public class Aluno extends GenericEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String email;

}
