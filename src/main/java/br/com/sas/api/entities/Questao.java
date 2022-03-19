package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="questoes")
public class Questao extends GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long ordem;
    private String enunciado;

    @ManyToOne()
    @JoinColumn(name="id_prova")
    private Prova prova;

    @ManyToOne()
    @JoinColumn(name="id_nivel")
    private Nivel nivel;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "questao")
    private List<Alternativa> alternativa;

}
