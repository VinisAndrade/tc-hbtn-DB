package com.techcamps.gestao.cursos.entities;

import javax.persistence.*;

@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    @ManyToOne
    private Aluno aluno;

    // Getters e Setters
}
