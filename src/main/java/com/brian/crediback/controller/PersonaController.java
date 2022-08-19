package com.brian.crediback.controller;

import com.brian.crediback.model.Persona;
import com.brian.crediback.service.PersonaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credifiel")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@AllArgsConstructor
public class PersonaController {
    private final PersonaService personaService;

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        List<Persona> personaList = personaService.listarPersonas();
        return new ResponseEntity<>(personaList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable("id") Long id) {
        Persona persona = personaService.buscarPersonaPorId(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) {
        Persona agregarPersona = personaService.agregarPersona(persona);
        return new ResponseEntity<>(persona, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> updateStudent(@RequestBody Persona persona) {
        Persona actualizarPersona = personaService.actualizarPersona(persona);
        return new ResponseEntity<>(actualizarPersona, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePersona(@PathVariable Long id) {
        personaService.borrarPersonaPorId(id);
        return new ResponseEntity<String>("Se ha borrado correctamente", HttpStatus.OK);
    }


}
