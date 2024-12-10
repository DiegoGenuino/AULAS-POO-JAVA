package com.senai.Aula02.ControleDeEstoque;

public class Produto {
    String nomeDoProduto;
    int quantidadeEmEstoque;

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
