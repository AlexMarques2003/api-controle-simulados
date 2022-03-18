package br.com.sas.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString()
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbTipos_Calculo_Prova")
public class TipoCalculoProva implements Serializable {

    private static final long serialVersionUID = -8006832511572891629L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

}
