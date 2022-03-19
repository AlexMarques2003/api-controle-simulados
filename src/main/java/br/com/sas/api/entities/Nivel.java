package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString()
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="niveis")
public class Nivel extends GenericEntity{

	private String descricao;
	private Double peso;

}
