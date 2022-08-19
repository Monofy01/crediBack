package com.brian.crediback.service;

import com.brian.crediback.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    Persona agregarPersona(Persona persona);
    List<Persona> listarPersonas();
    Persona buscarPersonaPorId(Long id);
    Persona actualizarPersona(Persona persona);
    void borrarPersonaPorId(Long id);


}
