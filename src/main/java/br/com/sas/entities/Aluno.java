package br.com.sas.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString 
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="aluno")
public class Aluno implements Serializable {

	private static final long serialVersionUID = -6358414406926871553L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	
	private String nome;
	
	@OneToMany(mappedBy="aluno", fetch = FetchType.LAZY)
	private List<LancamentoSimulado> lancamentos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
}
