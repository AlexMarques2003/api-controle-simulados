package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString()
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tipos_calculo_prova")
public class TipoCalculoProva extends GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;

}
