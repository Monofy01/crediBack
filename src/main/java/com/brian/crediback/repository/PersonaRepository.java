package com.brian.crediback.repository;

import com.brian.crediback.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    @Transactional
    void deletePersonaById(Long id);

    Optional<Persona> findPersonaById(Long id);
}
