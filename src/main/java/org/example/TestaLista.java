package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaLista {
    Lista lista = new Lista();
    int valor = 0;

    int resp = 0;

    public void menu(Scanner escolha){
        do{
            System.out.println("Escolha a opção\n1->Inserir no Início:\n2->Inserir no fim:\n3->Pesquisar um valor:\n4->Listar valores da lista:");
            resp = Integer.parseInt(escolha.next());
            if(resp == 1){
                System.out.println("Digite um Valor: ");
                valor = Integer.parseInt(escolha.next());
                lista.Insere_Inicio(valor);
            } else if (resp == 2) {
                System.out.println("Digite um Valor");
                lista.removeInicio();
            } else if (resp == 3) {
                System.out.println("Digite um Valor");
                valor = Integer.parseInt(escolha.next());
                if(lista.Procura(valor) == true)
                    System.out.println("Encontrado!");
                else
                    System.out.println("Não existe o número");

            } else if (resp ==  4) {
                ArrayList<Integer> listar = new ArrayList<Integer>();
                listar = lista.Listar();
                for(int elemento : listar){
                    System.out.println(elemento + " ");
                }
                System.out.println();
            }
            else
                System.out.println("opção inválida");
        }while(resp != 9);
    }
}
