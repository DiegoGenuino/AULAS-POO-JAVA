package com.senai.Aula02.Tarefa;

public class Tarefa {
    private String nomeTarefa;
    private boolean statusConclusao;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.statusConclusao = false; // Inicialmente, a tarefa não está concluída
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public boolean isStatusConclusao() {
        return statusConclusao;
    }

    public void setStatusConclusao(boolean statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    @Override
    public String toString() {
        return nomeTarefa + (statusConclusao ? " (Concluída)" : " (Pendente)");
    }
}