package br.com.sas.api.services;

import br.com.sas.api.entities.Nivel;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface NivelService {

    Nivel persistir(Nivel nivel);
    Optional<Nivel> buscarPorDescricao(String descricao);

}
