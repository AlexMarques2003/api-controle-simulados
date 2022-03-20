package br.com.sas.api.dtos;

import br.com.sas.api.entities.Questao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AlternativaDto {

    private Questao questao;
    private String opcao;
    private Boolean correta;

}
