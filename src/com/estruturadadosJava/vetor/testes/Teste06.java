package com.estruturadadosJava.vetor.testes;

import com.estruturadadosJava.vetor.Vetor;

public class Teste06 {
    public static void main(String[] args) {

            Vetor vetor = new Vetor(10);

            vetor.adicionar("B");
            vetor.adicionar("C");
            vetor.adicionar("E");
            vetor.adicionar("F");
            vetor.adicionar("G");

            System.out.println(vetor);

            vetor.adicionar(0, "A");

            System.out.println(vetor);

            vetor.adicionar(3, "D");

            System.out.println(vetor);



        }
    }

