package com.aluracurso.frases_peliculas.service;

import com.aluracurso.frases_peliculas.dto.FraseDTO;
import com.aluracurso.frases_peliculas.model.Frase;
import com.aluracurso.frases_peliculas.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {

       Frase frase = repository.obtenerFraseAleatoria();
       return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
