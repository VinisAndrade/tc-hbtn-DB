package com.techcamps.gestao.cursos.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String matricula;
    private Date nascimento;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    private List<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    private List<Telefone> telefones;

    // Getters e Setters
}
