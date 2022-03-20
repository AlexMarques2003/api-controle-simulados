package br.com.sas.api.services;

import br.com.sas.api.entities.Nivel;
import br.com.sas.api.entities.ParametrosServico;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ParametrosServicoService {

    ParametrosServico persistir(ParametrosServico parametrosServico);
    Optional<Nivel> buscarPorDescricao(String descricao);

}
