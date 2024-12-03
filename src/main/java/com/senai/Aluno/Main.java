package com.senai.Aluno;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Diego", 16, 8);
        Aluno aluno2 = new Aluno("João", 11, 10);
        Aluno aluno3 = new Aluno("Matheus", 18, 5);

        aluno1.atualizaNota(4);

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();


        aluno1.verificarNota(aluno1.notaAluno);
        aluno2.verificarNota(aluno2.notaAluno);
        aluno3.verificarNota(aluno3.notaAluno);

    }
}
