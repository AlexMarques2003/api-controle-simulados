package br.com.sas.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name="prova")
public class Prova implements Serializable {

	private static final long serialVersionUID = -8844272168141705806L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;

	@Column(name = "materia", nullable = false)	
	private String materia;
	
	@OneToOne(mappedBy="prova", fetch = FetchType.LAZY)
	private Gabarito gabarito;
	
	@ManyToMany(mappedBy="prova", fetch = FetchType.LAZY)
	private List<LancamentoSimulado> lancamentos;
	
}
