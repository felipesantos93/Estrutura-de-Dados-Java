package com.estruturadadosJava.vetor.teste;

import com.estruturadadosJava.vetor.Vetor;

public class Teste08 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(4);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);


    }
}
