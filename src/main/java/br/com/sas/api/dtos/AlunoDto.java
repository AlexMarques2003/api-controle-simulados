package br.com.sas.api.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDto {

    private Long id;
    private String nome;

    private String email;

}
