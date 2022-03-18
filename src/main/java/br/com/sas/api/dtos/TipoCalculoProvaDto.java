package br.com.sas.api.dtos;

import lombok.*;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
public class TipoCalculoProvaDto {

    private Long id;
    private String descricao;

}

