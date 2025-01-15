package demo;

import entities.Produto;
import models.ProdutoModel;

import java.util.List;

public class AdministrativoApp {

    public static void main(String[] args) {
        ProdutoModel produtoModel = new ProdutoModel();

        // Criar produto
        Produto p = new Produto();
        p.setNome("TV");
        p.setQuantidade(10);
        p.setPreco(500.00);
        p.setStatus(true);

        produtoModel.create(p);

        // Buscar todos os produtos
        List<Produto> produtos = produtoModel.findAll();
        produtos.forEach(prod -> System.out.println("Produto: " + prod.getNome()));

        // Atualizar produto
        p.setPreco(550.00);
        produtoModel.update(p);

        // Deletar produto
        produtoModel.delete(p.getId());
    }
}
