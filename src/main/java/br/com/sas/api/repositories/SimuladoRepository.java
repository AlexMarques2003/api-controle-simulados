package br.com.sas.api.repositories;

import br.com.sas.api.entities.Simulado;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SimuladoRepository {

    Simulado persistir(Simulado simulado);

    Optional<Simulado> buscarPorId(Long id);

}
