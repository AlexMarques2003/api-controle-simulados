package br.com.sas.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbLancamentos")
public class LancamentoSimulado implements Serializable{
	
	private static final long serialVersionUID = 8281179939868467422L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;
		
	@Column(name = "simulado", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)	
	private Long simulado;	
	
	@Column(name = "prova", nullable = false)
	@ManyToMany(mappedBy="prova", fetch = FetchType.LAZY)	
	private Long prova;
	
	@Column(name = "aluno", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private Aluno aluno;
	
	@Column(name = "questao", nullable = false)	
	private Long questao;
	
	@Column(name = "resposta", nullable = false)
	private String resposta;
	
	@OneToOne(mappedBy="nivel")
	private Nivel nivel;
	
	
	
}
