package br.com.sas.api.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TipoCalculoProvaDto extends GenericDto {

    private String descricao;

}

