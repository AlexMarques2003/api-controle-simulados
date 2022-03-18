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
@Table(name="tbAlternativas")
public class Alternativa implements Serializable {

    private static final long serialVersionUID = -5057507801963166725L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "opcao", nullable = false)
    private String opcao;

    @Column(name = "correta", nullable = false)
    private String correta;

}
