package heranca_interface;

import java.util.*;

public class Vetor implements Operacoes {
    private int[] vetor = new int[5];
    private int total = 0;

    public void insere(int elemento){

        // VETOR.LENGTH = 5;
        if(vetor[vetor.length - 1] != 0){
            int novoVetor[] = new int[vetor.length * 2];
            System.arraycopy(vetor, 0, novoVetor, 0, vetor.length);
            vetor = novoVetor;

            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == 0){
                    vetor[i] = elemento;
                    total++;
                    break;
                }
            }
        }
        else{
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == 0){
                    vetor[i] = elemento;
                    total++;
                    break;
                }
            }
        }
    }

    public int busca(int elemento){
        for(int i = 0; i < total; i++){
            if(vetor[i] == elemento) return 1;
        }
        return 0;
    }

    public void remove(int elemento){
        int[] aux = vetor;
        boolean posicao = false;

        for(int i = 0; i < total; i++){
            if(vetor[i] == elemento)
                posicao = true;

            if(!posicao)
                aux[i] = vetor[i];
            else{
                aux[i] = vetor[i+1];
            }
        }
        if(posicao){
            System.out.println("o elemento foi removido.");
            total--;
        }else
            System.out.println("o elemento não está na lista.");
    }

    public int maiorValor(){
        int maior = 0;
        for(int i = 0; i < total; i++){
            if(vetor[i] > maior) maior = vetor[i];
        }
        return maior;
    }
    public int menorValor(){
        int menor = 10000;
        for(int i = 0; i < total; i++){
            if(vetor[i] < menor) menor = vetor[i];
        }
        return menor;
    }

    public void imprime(){
        for(int i = 0; i < total; i++){
            System.out.printf("%d / ", vetor[i]);
        }
        System.out.println();
    } 
}
