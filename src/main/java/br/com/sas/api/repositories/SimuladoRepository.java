package br.com.sas.api.repositories;

import br.com.sas.api.entities.Simulado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimuladoRepository extends JpaRepository<Simulado, Long> {

    void deleteById(Long id);

}
