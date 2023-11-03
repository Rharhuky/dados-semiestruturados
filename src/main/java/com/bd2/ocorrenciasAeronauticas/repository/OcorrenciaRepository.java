package com.bd2.ocorrenciasAeronauticas.repository;

import com.bd2.ocorrenciasAeronauticas.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

}
