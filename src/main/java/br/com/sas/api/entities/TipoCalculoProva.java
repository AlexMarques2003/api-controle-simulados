package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name="tipos_calculo_prova")
public class TipoCalculoProva implements Serializable {

    private static final long serialVersionUID = -2323761123958078834L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter(AccessLevel.PUBLIC)
    private Long id;

    private String descricao;

}
