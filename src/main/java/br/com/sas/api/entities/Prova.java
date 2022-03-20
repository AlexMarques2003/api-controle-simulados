package br.com.sas.api.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity(name="provas")
@ToString
@Getter
@Setter
@NoArgsConstructor
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

	private Date data;

}
