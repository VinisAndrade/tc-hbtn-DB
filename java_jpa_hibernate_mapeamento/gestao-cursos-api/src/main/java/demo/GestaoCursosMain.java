package com.techcamps.gestao.cursos.demo;

import com.techcamps.gestao.cursos.entities.*;
import com.techcamps.gestao.cursos.models.AlunoModel;

public class GestaoCursosMain {
    public static void main(String[] args) {
        AlunoModel alunoModel = new AlunoModel();

        Aluno aluno = new Aluno();
        aluno.setNomeCompleto("João Silva");
        aluno.setMatricula("2023001");
        aluno.setEmail("joao.silva@gmail.com");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua das Flores");
        endereco.setEndereco("123");
        endereco.setCidade("São Paulo");

        aluno.setEnderecos(List.of(endereco));

        alunoModel.create(aluno);

        System.out.println("Aluno criado com sucesso!");
    }
}
