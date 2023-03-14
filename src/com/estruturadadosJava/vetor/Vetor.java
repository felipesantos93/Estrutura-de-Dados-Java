package com.estruturadadosJava.vetor;

public class Vetor {
    private String[] elemento;
    private int tamanho;

    public Vetor(int capacidade ) {
        this.elemento = new String[capacidade];
    }

    public boolean adicionar(String elemento){
        if (this.tamanho < this.elemento.length){
            this.elemento[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    public boolean adicionar(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição inválida");
        }
        // mover os elementos dentro de um vetor
        for (int i = this.tamanho-1; i >= posicao;i--){
            this.elemento[i+1]= this.elemento[i];
        }
        this.elemento[posicao]=elemento;
        this.tamanho++;
        return false;
    }

    public int getTamanho(){
        return this.tamanho;

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0 ; i<this.tamanho-1; i++){
            s.append(this.elemento[i]);
            s.append(",");
        }
        if (this.tamanho>0) {
            s.append(this.elemento[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString() ;

    }

    public String busca (int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição inválida");
        }
        return this.elemento[posicao];

    }

    public boolean busca (String elemento){
        for (int i = 0 ; i<this.tamanho ; i++){
            if (this.elemento[i].equals(elemento)){
                return true;
            }
        }
        return false;

    }


}
