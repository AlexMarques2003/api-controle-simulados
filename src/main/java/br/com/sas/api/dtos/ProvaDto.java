package br.com.sas.api.dtos;

import br.com.sas.api.entities.Simulado;
import br.com.sas.api.entities.TipoCalculoProva;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProvaDto extends GenericDto {

    private String materia;
    private TipoCalculoProva tiposCalculoProva;
    private Simulado simulado;
    private Date data;



}
