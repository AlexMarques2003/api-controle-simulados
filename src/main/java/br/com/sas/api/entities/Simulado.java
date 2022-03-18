package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbSimulados")
public class Simulado implements Serializable {

	private static final long serialVersionUID = -1222730842654701553L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)		
	private Long id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "status_finalizado", nullable = false)
	private Boolean status;

}
