package br.com.sas.api.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SimuladoDto extends GenericDto{

    private String descricao;
    private Boolean status;
    private Boolean calculado;

}
