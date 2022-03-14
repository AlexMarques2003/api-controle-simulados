package br.com.sas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prova")
public class Prova implements Serializable {

	private static final long serialVersionUID = -8844272168141705806L;
	
	private Long id;
	private String materia;
	
	public Prova() {
	}
			
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "materia", nullable = false)	
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Prova [id=" + id + ", materia=" + materia + "]";
	}
		
	
	

}
