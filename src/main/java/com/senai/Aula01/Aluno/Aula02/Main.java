package com.senai.Aula01.Aluno.Aula02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Tarefa>
    public static void main(String[] args) {
        String menu = "" +
                "--- GERENCIADOR DE TAREFAS ---\n" +
                "    1 - ADICIONAR TAREFA\n" +
                "    2 - LISTAR TAREFAS\n" +
                "    3 - MARCAR TAREFA COMO CONCLUÍDA\n" +
                "    4 - REMOVER TAREFA\n" +
                "    5 - SAIR\n";

        int opcao = 0;

        do {
            System.out.println(menu);
            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

        } while (opcao != 5);
        {
            switch (opcao) {
                case 1:
                    System.out.println("Inserir tarefa");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Tchau!");
                    break;

                default:
                    System.out.println("Número inválido.");

            }
        }
    }


}


