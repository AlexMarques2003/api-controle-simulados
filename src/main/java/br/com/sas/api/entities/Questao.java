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
@Entity
@Table(name="tbQuestoes")
public class Questao implements Serializable {

    private static final long serialVersionUID = 3089336424943878062L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne()
    @JoinColumn(name="id_prova")
    private Prova provas;

    @ManyToOne()
    @JoinColumn(name="id_nivel")
    private Nivel niveis;

}
