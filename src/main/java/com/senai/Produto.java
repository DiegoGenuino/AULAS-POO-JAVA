package com.senai;

public class Produto {
    // Atributos da classe
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor para inicializar o objeto Produto
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir os detalhes do produto
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    // Método para atualizar o estoque (soma ou subtração)
    public void atualizaEstoque(int valor) {
        quantidade += valor; // valor pode ser positivo (adicionar) ou negativo (remover)
        if (quantidade < 0) {
            quantidade = 0; // Garantir que o estoque não seja negativo
        }
    }

    // Método para calcular o valor total do estoque
    public double calcularValorEstoque() {
        return preco * quantidade;
    }
}
