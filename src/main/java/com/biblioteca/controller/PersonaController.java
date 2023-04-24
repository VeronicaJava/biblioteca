package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.model.Persona;
import com.biblioteca.service.LibroService;
import com.biblioteca.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    private List<Persona> verPersona(){
        return personaService.verPersona();
    }

    @PostMapping("/persona")
    private void crearPersona(@RequestBody Persona persona){

       personaService.crearYActualizarPersona(persona);
    }

    @DeleteMapping("/persona/{id}")
    private void eliminarPersona(@PathVariable("id") Long id){

        personaService.eliminarPersona(id);
    }

    @PutMapping("/persona")
    private void editarPersona(@RequestBody Persona persona) {

        personaService.crearYActualizarPersona(persona);
    }
}