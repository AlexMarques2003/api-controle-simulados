package br.com.sas.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LancamentoSimulado implements Serializable{
	
	private static final long serialVersionUID = 8281179939868467422L;

	private Long id;
	private Long simulado;
	private Long prova;
	private Long aluno;
	private Long questao;
	private String resposta;
	
	public LancamentoSimulado() {
		
	}
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSimulado() {
		return simulado;
	}

	public void setSimulado(Long simulado) {
		this.simulado = simulado;
	}

	public Long getProva() {
		return prova;
	}

	public void setProva(Long prova) {
		this.prova = prova;
	}

	public Long getAluno() {
		return aluno;
	}

	public void setAluno(Long aluno) {
		this.aluno = aluno;
	}






	public Long getQuestao() {
		return questao;
	}






	public void setQuestao(Long questao) {
		this.questao = questao;
	}






	public String getResposta() {
		return resposta;
	}






	public void setResposta(String resposta) {
		this.resposta = resposta;
	}






	@Override
	public String toString() {
		return "LancamentoSimulado [id=" + id + ", simulado=" + simulado + ", prova=" + prova + ", aluno=" + aluno
				+ ", questao=" + questao + ", resposta=" + resposta + "]";
	}
	
	
	
}
