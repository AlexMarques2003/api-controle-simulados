package br.com.sas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@Entity
@Table(name="simulado")
public class Simulado implements Serializable {

	private static final long serialVersionUID = -2879734550335318222L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	
}
