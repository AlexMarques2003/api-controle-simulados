package br.com.sas.api.dtos;

import lombok.*;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
public class NivelDto {

    private Long id;
    private String descricao;
    private Float pontuacao;
}
