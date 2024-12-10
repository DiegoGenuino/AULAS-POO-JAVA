package com.senai.Aula02.ControleDeEstoque;

import com.senai.Aula02.Tarefa.Tarefa;

import java.util.ArrayList;
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
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

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
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Número inválido.");
            }
        } while (opcao != 6);
    }

    public static void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");

        String nomeProduto = scanner.nextLine();
        Produto novoProduto = new Produto(nomeProduto);
        produtos.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso");
    }

    public static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado");
        } else {
            System.out.println("--- PRODUTOS ---");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(" i + 1, " + produtos.get(i));
            }
        }
    }

    public static void atualizarQuantidade() {

    }

    public static void removerProduto() {

    }

    public static void buscarProduto() {

    }
}
