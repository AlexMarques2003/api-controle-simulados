package br.com.sas.api.repositories;

import br.com.sas.api.entities.ParametrosServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametrosServicoRepository extends JpaRepository<ParametrosServico, Long> {

    void deleteById(Long id);
}
