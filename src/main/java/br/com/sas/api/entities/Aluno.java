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

	private String nome;
	private String email;

}
