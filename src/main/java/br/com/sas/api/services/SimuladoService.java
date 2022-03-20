package br.com.sas.api.services;

import br.com.sas.api.entities.Simulado;
import org.springframework.stereotype.Service;

@Service
public interface SimuladoService {

    Simulado persistir(Simulado simulado);
    Simulado buscarPorId(Long id);
    Simulado buscarPorDescricao(String nome);
    Simulado buscarPorStatus(Boolean status);

}
