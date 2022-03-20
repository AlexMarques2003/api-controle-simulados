package br.com.sas.api.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name="alternativas")
public class Alternativa implements Serializable {

    private static final long serialVersionUID = -7909426288909062904L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_questao")
    private Questao questao;

    private String opcao;
    private Boolean correta;

}
