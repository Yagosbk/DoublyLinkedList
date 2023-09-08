package org.example;
import java.util.ArrayList;

public class Lista {
    private Node primeiro = null, ultimo = null;

    public Node getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Node primeiro) {
        this.primeiro = primeiro;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }

    public ArrayList<Integer> Listar() throws IllegalArgumentException {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        if(primeiro == null)
            throw new IllegalArgumentException("A lista está vazia");
        else{
            Node aux = getPrimeiro();
            while(aux != null){
                int vl = aux.getValor();
                lista.add(vl);
                aux = aux.getProximo();
            }
            return lista;
        }

    }

    public boolean Procura(int valor){
        Node aux = getPrimeiro();
        while(aux != null){
            if(valor == aux.getValor()){
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }

    public void Insere_Inicio(int valor){
        Node novo = new Node();
        if(primeiro == null){
            novo.setValor(valor);
            setPrimeiro(novo);
            setUltimo(novo);
        }
        else{
            primeiro.setAnterior(novo);
            novo.setValor(valor);
            novo.setProximo(primeiro);
            setPrimeiro(novo);
        }
    }

    public void Insere_Fim(int valor){
        Node novo = new Node();
        if(ultimo == null){
            novo.setValor(valor);
            ultimo = novo;
        }
        else{
           ultimo.setProximo(novo);
           novo.setValor(valor);
           ultimo = novo;
        }
    }

    public void removeInicio(){
        primeiro = primeiro.getProximo();
    }
}
