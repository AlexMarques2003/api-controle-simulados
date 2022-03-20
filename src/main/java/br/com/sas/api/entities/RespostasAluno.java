package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity(name="respostas_aluno")
public class RespostasAluno implements Serializable {

    private static final long serialVersionUID = 6814615158778148709L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter(AccessLevel.PUBLIC)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_questao")
    private Questao questao;

    private String resposta;

}
