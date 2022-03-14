package br.com.sas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gabarito")
public class Gabarito implements Serializable {


	private static final long serialVersionUID = 6532462652310997513L;

	private Long id;
	private Long prova;
	private String resposta;
	private Long nivel;
	
	public Gabarito() {
	}
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "prova", nullable = false)
	public Long getProva() {
		return prova;
	}

	public void setProva(Long prova) {
		this.prova = prova;
	}

	@Column(name = "resposta", nullable = false)
	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@Column(name = "nivel", nullable = false)
	public Long getNivel() {
		return nivel;
	}







	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}







	@Override
	public String toString() {
		return "Gabarito [id=" + id + ", prova=" + prova + ", resposta=" + resposta + ", nivel=" + nivel + "]";
	}

	
	
	
}
