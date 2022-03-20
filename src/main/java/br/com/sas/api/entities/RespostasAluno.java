package br.com.sas.api.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity(name="respostas_aluno")
@ToString
@Getter
@Setter
@NoArgsConstructor
public class RespostasAluno extends GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_questao")
    private Questao questao;

    private String resposta;

}
