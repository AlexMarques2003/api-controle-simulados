package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name="alunos")
public class Aluno implements Serializable {

	private static final long serialVersionUID = 2237669832816784578L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String email;

}
