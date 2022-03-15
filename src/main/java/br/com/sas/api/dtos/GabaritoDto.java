package br.com.sas.api.dtos;

import br.com.sas.api.entities.Nivel;
import br.com.sas.api.entities.Prova;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
public class GabaritoDto {

    private Long id;
    private Long prova;
    private Long questao;
    private String resposta;
    private Long Nivel;

}
