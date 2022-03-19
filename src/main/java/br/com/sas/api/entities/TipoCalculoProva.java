package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString()
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tipos_calculo_prova")
public class TipoCalculoProva extends GenericEntity {

    private String descricao;

}
