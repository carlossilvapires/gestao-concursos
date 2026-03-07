package com.gestao.concursos.repository;

import com.gestao.concursos.model.Concurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcursoRepository extends JpaRepository<Concurso, Long> {
}
