package com.techcamps.gestao.cursos.entities;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;
    private String cidade;
    private String estado;

    @ManyToOne
    private Aluno aluno;

    // Getters e Setters
}
