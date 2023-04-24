package com.biblioteca.model;

import com.biblioteca.enums.Enum_Estado;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "autor", nullable = false, length = 10)
    private String autor;

    @Column(name = "fechaPublicacion", nullable = false, length = 15)
    private LocalDate fechaPublicacion;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    private int numVecesPrestado;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private Enum_Estado estado;
}