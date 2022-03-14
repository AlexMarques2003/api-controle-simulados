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
@Table(name="simulado")
public class Simulado implements Serializable {

	private static final long serialVersionUID = -2879734550335318222L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@ManyToMany(mappedBy="simulado", fetch = FetchType.LAZY)
	private List<LancamentoSimulado> lancamentos;
	

}
