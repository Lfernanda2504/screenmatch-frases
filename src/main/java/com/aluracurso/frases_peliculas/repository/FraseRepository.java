package com.aluracurso.frases_peliculas.repository;

import com.aluracurso.frases_peliculas.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f from Frase f order by function('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
