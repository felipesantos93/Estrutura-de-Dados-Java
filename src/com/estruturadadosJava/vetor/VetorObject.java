package com.estruturadadosJava.vetor;

public class VetorObject {
    private Object[] elemento;
    private int tamanho;

    public VetorObject(int capacidade ) {
        this.elemento = new Object[capacidade];
    }

    public boolean adicionar(Object elemento){
        amumentaCapacidade();
        if (this.tamanho < this.elemento.length){
            this.elemento[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    public boolean adicionar(int posicao, Object elemento){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição inválida");
        }
        amumentaCapacidade();
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

    public Object busca (int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição inválida");
        }
        return this.elemento[posicao];

    }

    public boolean busca (Object elemento){
        for (int i = 0 ; i<this.tamanho ; i++){
            if (this.elemento[i].equals(elemento)){
                return true;
            }
        }
        return false;

    }
    public void amumentaCapacidade(){
        if (this.tamanho == this.elemento.length){
            Object[] elementosNovos = new Object[this.elemento.length * 2];
            for (int i = 0; i < this.elemento.length; i++) {
                elementosNovos[i]= this.elemento[i];
            }
            this.elemento =elementosNovos;
        }
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição inválida");
        }
        for (int i = posicao; i <this.tamanho-1; i++) {
            this.elemento[1] = this.elemento[i+1];
        }
        this.tamanho--;
    }


}
