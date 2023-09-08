package org.example;

public class Node {
    private Node anterior;
    private Node proximo;
    private int valor;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
