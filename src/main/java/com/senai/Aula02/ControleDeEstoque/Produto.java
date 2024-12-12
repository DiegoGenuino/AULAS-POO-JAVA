package com.senai.Aula02.ControleDeEstoque;

class Produto {
    private String nomeDoProduto;
    private int quantidadeEmEstoque;
    private int idProduto;

    public Produto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.quantidadeEmEstoque = 0; // Valor padrão
    }

   

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    @Override
    public String toString() {
        return "ID: " + idProduto + " Nome: " + nomeDoProduto + " | Quantidade: " + quantidadeEmEstoque;
    }
}
