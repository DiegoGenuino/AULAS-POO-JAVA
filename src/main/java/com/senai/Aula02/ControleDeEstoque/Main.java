package com.senai.Aula02.ControleDeEstoque;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        String menu = "" +
                "--- CONTROLE DE ESTOQUE ---\n" +
                "    1 - CADASTRAR PRODUTO\n" +
                "    2 - LISTAR PRODUTOS\n" +
                "    3 - ATUALIZAR QUANTIDADE\n" +
                "    4 - REMOVER PRODUTO\n" +
                "    5 - BUSCAR PRODUTO\n" +
                "    6 - SAIR\n";
        int opcao;

        do {
            System.out.println(menu);
            System.out.print("Digite uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do teclado
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine(); // Limpa o buffer
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    atualizarQuantidade();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 5:
                    buscarProduto();
                    break;
                case 6:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    public static void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        Produto novoProduto = new Produto(nomeProduto);
        produtos.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("--- LISTA DE PRODUTOS ---");
            for (Produto produto : produtos) {
                System.out.println(produto);

            }
        }
    }

    public static void atualizarQuantidade() {
        System.out.print("Digite o nome do produto a ser atualizado: ");
        String nomeProduto = scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getNomeDoProduto().equalsIgnoreCase(nomeProduto)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Digite a nova quantidade em estoque: ");
        try {
            int novaQuantidade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            if (novaQuantidade < 0) {
                System.out.println("A quantidade deve ser positiva.");
                return;
            }
            produtoEncontrado.setQuantidadeEmEstoque(novaQuantidade);
            System.out.println("Quantidade do produto atualizada com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            scanner.nextLine(); // Limpa o buffer
        }
    }

    public static void removerProduto() {
        System.out.print("Digite o nome do produto a ser removido: ");
        String removerItem = scanner.nextLine();

        boolean removido = produtos.removeIf(produto -> produto.getNomeDoProduto().equalsIgnoreCase(removerItem));

        if (removido) {
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void buscarProduto() {
        System.out.print("Digite o nome do produto a ser buscado: ");
        String nomeProduto = scanner.nextLine();

        for (Produto produto : produtos) {
            if (produto.getNomeDoProduto().equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado: " + produto);
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }
}

