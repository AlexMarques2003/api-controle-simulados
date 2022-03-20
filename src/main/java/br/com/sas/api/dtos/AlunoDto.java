package br.com.sas.api.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AlunoDto extends GenericDto{

    private String nome;
    private String email;

}
