package codigos_aula;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class exercicio10_04 {

    public static void numeros_randomicos(int n) throws IOException {
        try {
            // cria o arquivo
            File arquivo = new File ("arquivo.txt");
            // criando a funcao que escreve no arquivo
            BufferedWriter escreve_arquivo = new BufferedWriter(new FileWriter(arquivo));
            int aux;
            Random numeros_aleatorios = new Random(); // gera os numeros aleatorios
            for (int i = 0; i < n; i++){
                aux = numeros_aleatorios.nextInt(10);
                escreve_arquivo.write(String.valueOf(aux)); // escreve no arquivo
                escreve_arquivo.newLine();
            }
            escreve_arquivo.close();
        // trata as excecoes das funcoes de entrada e saida do programa
        } catch (IOException e) {
            System.out.println("Ocorreu um erro durante a execucao do arquivo!");
            e.printStackTrace();
        }
    }

    public static boolean verifica(ArrayList<Integer> vet, int elemento){
        for(int i = 0; i < vet.size(); i++){
            if (vet.get(i) == elemento){ // se o elemento estiver na lista, retorna true
                return true;
            }
        }
        return false;
    }

    public static void porcentagem(int[] vet, ArrayList<Integer> vet_sem_repeticao){
        int cont = 0;
        for(int i = 0; i < vet_sem_repeticao.size(); i++){
            for(int j = 0; j < vet.length; j++){
                if(vet_sem_repeticao.get(i) == vet[j]){
                    cont++; // contador para saber quantas vezes o elemento apareceu na lista
                }
            }
            System.out.println(vet_sem_repeticao.get(i) + " aparece " + cont + " vezes. Porcentagem: " + ((cont*100.0)/vet.length) + "%.");
            cont = 0;
        }
    }

    public static void le_arquivo(int n, int[] vetor){
        try {
            BufferedReader leitura_arquivo = new BufferedReader(new FileReader("arquivo.txt"));
            int cont = 0;
            String linha = "";
            while((linha = leitura_arquivo.readLine()) != null){
                vetor[cont] = Integer.valueOf(linha); // passando a string do arquivo pra inteiro no vetor
                cont++;
            }

            leitura_arquivo.close();
            
            ArrayList<Integer> vetor_sem_repeticao = new ArrayList<Integer>();
            for(int i = 0; i < vetor.length; i++){
                if(!verifica(vetor_sem_repeticao, vetor[i])){
                    vetor_sem_repeticao.add(vetor[i]); // cria uma lista sem repeticoes
                }    
            }

            porcentagem(vetor, vetor_sem_repeticao);

        } catch (IOException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        try{
            int n;
            System.out.println("entre com a quantidade desejada de numeros no arquivo:");
            Scanner ler_dados = new Scanner(System.in); // cria uma funcao para ler a entrada do teclado
            n = ler_dados.nextInt(); // n recebe o valor que esta entrando
            int[] vetor_numeros = new int[n]; // cria vetor
            numeros_randomicos(n);
            le_arquivo(n, vetor_numeros);
            ler_dados.close();
        } catch (IOException e){
            System.out.println("Erro");
        }
    }
}