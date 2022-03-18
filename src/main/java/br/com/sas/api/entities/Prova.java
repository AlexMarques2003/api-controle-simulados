package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbProvas")
public class Prova implements Serializable {

	private static final long serialVersionUID = -8844272168141705806L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_simulado")
	private Simulado simulado;

	@ManyToOne
	@JoinColumn(name = "id_tipo_calculo")
	private TipoCalculoProva tiposCalculoProva;

	@Column(name = "materia", nullable = false)
	private String materia;


}
