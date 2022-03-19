package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="provas")
public class Prova extends GenericEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_simulado")
	private Simulado simulado;

	@ManyToOne
	@JoinColumn(name = "id_tipo_calculo")
	private TipoCalculoProva tiposCalculoProva;

	private String materia;


}
