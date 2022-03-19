package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="simulados")
public class Simulado extends GenericEntity {

	private String descricao;
	private Boolean status;
	private Boolean calculado;

}
