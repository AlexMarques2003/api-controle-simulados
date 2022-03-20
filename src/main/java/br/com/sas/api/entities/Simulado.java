package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name="simulados")
public class Simulado implements Serializable {

	private static final long serialVersionUID = -3830302648925015297L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter(AccessLevel.PUBLIC)
	private Long id;

	private String descricao;
	private Boolean status;
	private Boolean calculado;

}
