package com.senai.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("RUA PIRACEMA", 10, "JARDIM VERAO", "Ribeirão Pire", 111111);

        Pessoa pessoa1 = new Pessoa(
                "Diego",
                16,
                new Endereco(
                        "Rua Piracema",
                        16,
                        "Vila rica",
                        "Ribeirão Pires",
                        121212
                )
        );

        Pessoa pessoa2 = new Pessoa(
                "Joao",
                16,
                new Endereco(
                        "Rua Piracema",
                        16,
                        "Vila rica",
                        "Ribeirão Pires",
                        121212
                )
        );

        Pessoa pessoa3 = new Pessoa(
                "Yago",
                16,
                new Endereco(
                        "Rua Aldemir",
                        16,
                        "Vila rica",
                        "Ribeirão Pires",
                        121642
                )
        );


        Pessoa[] pessoas  = new Pessoa[3];
        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;
        pessoas[2] = pessoa3;



        ArrayList pessoalist = new ArrayList<>();

        pessoalist.add(pessoa1);
        pessoalist.add(pessoa2);
        pessoalist.add(pessoa3);
        pessoalist.add(new Pessoa("jefi", 12, endereco));

        System.out.println(pessoalist.get(6));


        System.out.println(pessoa1);


        System.out.println(pessoa1.endereco.rua);

        pessoa1.Falar();
    }
}
