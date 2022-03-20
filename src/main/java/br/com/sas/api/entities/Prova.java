package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name="provas")
public class Prova implements Serializable {

	private static final long serialVersionUID = 4540855907451990482L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter(AccessLevel.PUBLIC)
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
