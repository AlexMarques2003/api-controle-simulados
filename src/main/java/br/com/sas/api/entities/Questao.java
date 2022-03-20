package br.com.sas.api.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity(name="questoes")
@ToString
@Getter
@Setter
@NoArgsConstructor
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
