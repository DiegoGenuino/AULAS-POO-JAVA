package com.senai.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("ARROZ", 15.00, 10);
        Produto produto2 = new Produto("FEIJÃO", 20.00, 5);

        produto1.atualizaEstoque(15);
        produto1.exibirDetalhes();
        produto1.exibirEstoque();
        produto2.exibirEstoque();


    }
}
