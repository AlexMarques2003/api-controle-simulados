package br.com.sas.api.repositories;

import br.com.sas.api.entities.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelRepository extends JpaRepository<Nivel, Long> {

    void deleteById(Long id);

}