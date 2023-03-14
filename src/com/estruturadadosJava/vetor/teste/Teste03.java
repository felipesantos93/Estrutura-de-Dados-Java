package com.estruturadadosJava.vetor.teste;

import com.estruturadadosJava.vetor.Vetor;

public class Teste03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("1");
        vetor.adicionar("2");
        vetor.adicionar("3");
        vetor.adicionar("4");
        vetor.adicionar("5");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);


    }
}
