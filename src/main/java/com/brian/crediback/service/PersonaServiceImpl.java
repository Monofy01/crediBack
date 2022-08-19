package com.brian.crediback.service;

import com.brian.crediback.model.Persona;
import com.brian.crediback.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Override
    public Persona agregarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona  buscarPersonaPorId(Long id) {
//        return personaRepository.findPersonaById(id).orElseThrow(() -> new PersonaNotFoundException("No existe persona con ese nombre"));
        return personaRepository.findPersonaById(id).orElseThrow(() -> new PersonaNotFoundException("No existe persona con ese nombre"));
    }

    @Override
    public Persona actualizarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void borrarPersonaPorId(Long id) {
        personaRepository.deletePersonaById(id);
    }
}
