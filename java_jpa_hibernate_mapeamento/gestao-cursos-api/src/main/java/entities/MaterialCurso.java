package com.techcamps.gestao.cursos.entities;

import javax.persistence.*;

@Entity
public class MaterialCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String url;

    @OneToOne
    private Curso curso;

    // Getters e Setters
}
