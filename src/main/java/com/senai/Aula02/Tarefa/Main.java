package com.senai.Aula02.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public static void main(String[] args) {
        String menu = "" +
                "--- GERENCIADOR DE TAREFAS ---\n" +
                "    1 - ADICIONAR TAREFA\n" +
                "    2 - LISTAR TAREFAS\n" +
                "    3 - MARCAR TAREFA COMO CONCLUÍDA\n" +
                "    4 - REMOVER TAREFA\n" +
                "    5 - SAIR\n";

        int opcao;

        do {
            System.out.println(menu);
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    marcarTarefaComoConcluida();
                    break;
                case 4:
                    removerTarefa();
                    break;
                case 5:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Número inválido.");
            }
        } while (opcao != 5);
    }

    public static void adicionarTarefa() {
        System.out.print("Digite o nome da tarefa: ");
        String nomeTarefa = scanner.nextLine();
        Tarefa novaTarefa = new Tarefa(nomeTarefa);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("--- TAREFAS ---");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.printf("%d - %s\n", i + 1, tarefas.get(i));
            }
        }
    }

    public static void marcarTarefaComoConcluida() {
        listarTarefas();
        if (!tarefas.isEmpty()) {
            System.out.print("Digite o número da tarefa a marcar como concluída: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine(); // Limpa o buffer do teclado

            if (index >= 0 && index < tarefas.size()) {
                tarefas.get(index).setStatusConclusao(true);
                System.out.println("Tarefa marcada como concluída!");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }

    public static void removerTarefa() {
        listarTarefas();
        if (!tarefas.isEmpty()) {
            System.out.print("Digite o número da tarefa a remover: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine(); // Limpa o buffer do teclado

            if (index >= 0 && index < tarefas.size()) {
                tarefas.remove(index);
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }
}