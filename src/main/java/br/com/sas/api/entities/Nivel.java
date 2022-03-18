package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString()
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbNiveis")
public class Nivel implements Serializable{

	private static final long serialVersionUID = -6974974288546183426L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "peso", nullable = false)
	private Float peso;

}
