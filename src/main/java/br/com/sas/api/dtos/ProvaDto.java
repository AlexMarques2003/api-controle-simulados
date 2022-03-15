package br.com.sas.api.dtos;

import lombok.*;

@Getter
@Setter
@ToString(includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
public class ProvaDto {

    private Long id;
    private String materia;

}
