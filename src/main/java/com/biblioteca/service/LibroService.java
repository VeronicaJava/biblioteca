package com.biblioteca.service;

import com.biblioteca.model.Libro;
import com.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public void crearYActualizar(Libro libro){
        libroRepository.save(libro);
    }

    public List<Libro> verLibro(){
        List<Libro> libros = new ArrayList<Libro>();
        libros.addAll(libroRepository.findAll());
        return libros;
    }

    public void eliminarLibro(Long id){
        libroRepository.deleteById(id);
    }
}
