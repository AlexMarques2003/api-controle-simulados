package br.com.sas.api.dtos;

import lombok.*;

import javax.validation.constraints.NotEmpty;

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
