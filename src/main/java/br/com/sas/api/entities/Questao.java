package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name="questoes")
public class Questao implements Serializable {

    private static final long serialVersionUID = -5228263324999568587L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter(AccessLevel.PUBLIC)
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
