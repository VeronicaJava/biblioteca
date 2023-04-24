package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping("/libro")
    private List<Libro> verLibro(){
        return libroService.verLibro();
    }

    @PostMapping("/libro")
    private void crearLibro(@RequestBody Libro libro){
        libroService.crearYActualizar(libro);
    }

    @DeleteMapping("/libro/{id}")
    private void eliminarLibro(@PathVariable("id") Long id){

        libroService.eliminarLibro(id);
    }

    @PutMapping("/libro")
    private void editarLibro(@RequestBody Libro libro){
        libroService.crearYActualizar(libro);
    }
}