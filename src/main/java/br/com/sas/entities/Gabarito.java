package br.com.sas.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name="gabarito")
public class Gabarito implements Serializable {


	private static final long serialVersionUID = 6532462652310997513L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;
	
	@Column(name = "prova", nullable = false)
	@ManyToMany(mappedBy = "prova") 
	private List<Prova> prova;

	@Column(name = "questao", nullable = false)	
	private Long questao;
	
	@Column(name = "resposta", nullable = false)
	private String resposta;
	
	@Column(name = "nivel", nullable = false)
	@ManyToMany(mappedBy = "nivel") 
	private List<Nivel> niveis;
	
}
