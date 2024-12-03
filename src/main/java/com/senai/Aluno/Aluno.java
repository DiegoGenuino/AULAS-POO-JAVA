package com.senai.Aluno;

public class Aluno {
    String nomeAluno;
    int idadeAluno;
    int notaAluno;

    public Aluno(String nomeAluno, int idadeAluno, int notaAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.notaAluno = notaAluno;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Idade do aluno: " + idadeAluno);
        System.out.println("E a nota do alun: " + notaAluno);
        System.out.println("================================");
    }


    public void atualizaNota(int notaNova) {
        notaAluno = notaNova;
    }

    public void verificarNota(int notaNova) {
        if (notaNova >= 6) {
            System.out.println(nomeAluno + " | Aprovado");
        } else {
            System.out.println(nomeAluno + " | Reprovado");
        }
    }

}
