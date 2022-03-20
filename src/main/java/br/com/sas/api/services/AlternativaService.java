package br.com.sas.api.services;

import br.com.sas.api.entities.Alternativa;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AlternativaService {

    Alternativa persistir(Alternativa alternativa);
    Optional<Alternativa> buscarPorQuestao(Long questao);

}
