package com.biblioteca.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="cedula", nullable = false, length = 15)
    private int cedula ;

    @NotNull
    @Size(min = 5, max = 50)
    @Column(name="nombre", nullable = false)
    private String nombre;

    private LocalDate fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Libro libro;
}