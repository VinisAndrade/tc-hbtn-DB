package com.techcamps.gestao.cursos.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String matricula;

    @OneToMany(mappedBy = "professor")
    private List<Curso> cursos;

    // Getters e Set
