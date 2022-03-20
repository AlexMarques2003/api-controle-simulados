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
@Entity(name = "parametros")
public class ParametrosServico implements Serializable {

    private static final long serialVersionUID = -5466450977586653975L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter(AccessLevel.PUBLIC)
    private Long id;
    private String chave;
    private Double valor;
    private String descricao;

}
