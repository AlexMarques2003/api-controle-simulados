package br.com.sas.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString 
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="tbAlunos")
public class Aluno implements Serializable {

	private static final long serialVersionUID = -6358414406926871553L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "email", nullable = false)
	private String email;

	@OneToMany(mappedBy="aluno", fetch = FetchType.LAZY)
	private List<LancamentoSimulado> lancamentos;
	
}
