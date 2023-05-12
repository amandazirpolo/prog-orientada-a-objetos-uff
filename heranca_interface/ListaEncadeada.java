package heranca_interface;

import java.util.*;

public class ListaEncadeada implements Operacoes {
    private No no = null;
    
    public void insere(int elemento){
        No novo = new No();
        novo.info = elemento;
        novo.prox = no;
        no = novo;
    }

    public int busca(int elemento){
        No aux = no;
        while(aux != null){
            if(aux.info == elemento) return 1;
            aux = aux.prox;
        }
        return 0;
    }

    public void remove(int elemento){
        No aux = no, ant = null;
        while((aux != null) && (aux.info != elemento)){
            ant = aux;
            aux = aux.prox;
        }
        /*o elemento a ser removido é o primeiro */
        if(ant == null){
            aux = aux.prox;
            return;
        }
        /*o elemento n esta na lista */
        if(aux == null)
             return;
        /*o elemento esta no meio/final da lista*/
        ant.prox = aux.prox;
        return;
    }

    public int maiorValor(){
        int maiorTmp = -1;
        No aux = no;
        while(aux != null){
            if(aux.info > maiorTmp){
                maiorTmp = aux.info;
            }
            aux = aux.prox;
        }
        return maiorTmp;
    }

    public int menorValor(){
        int menorTmp = 100000;
        No aux = no;
        while(aux != null){
            if(aux.info < menorTmp){
                menorTmp = aux.info;
            }
            aux = aux.prox;
        }
        return menorTmp;
    } 

    public void imprime(){
        No aux = no;
        while(aux != null){
            System.out.print(aux.info + " -> ");
            aux = aux.prox;
        }
        System.out.println("NULL");
    }

}