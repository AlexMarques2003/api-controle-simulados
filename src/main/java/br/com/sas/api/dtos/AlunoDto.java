package br.com.sas.api.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AlunoDto {

    @Getter(AccessLevel.PUBLIC)
    private Long id;

    private String nome;
    private String email;

}
