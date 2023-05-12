package heranca_interface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operacoes colecao = null;
        int op;

        /* criando os objetos da lista encadeada, do vetor e do menu */
        Menu menu = new Menu();

        try {
            do {
                System.out.println("deseja operar com lista encadeada ou vetor?");
                op = teclado.nextInt();
            }while (op != 1 && op != 2);

            if(op == 1) {
                colecao = new ListaEncadeada();
            }
            if(op == 2) {
                colecao = new Vetor();
            }
        } catch (Exception e) {
            System.out.println("não foi possível executar o programa");
            System.exit(1);
        }
        
        menu.imprimeMenu();
        System.out.println("digite a operação desejada: ");
        int seleciona = teclado.nextInt();
        while(seleciona != 7){
            switch(seleciona){
                case 1:
                    System.out.println("num de elementos a serem inseridos: ");
                    int num = teclado.nextInt();
                    for(int i = 0; i < num; i++){
                        colecao.insere(teclado.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("qual elemento deseja buscar? ");
                    if(colecao.busca(teclado.nextInt()) != -1){
                        System.out.println("o elemento está na lista");
                    } else {
                        System.out.println("o elemento não está na lista");
                    }
                    break;
                case 3:
                    System.out.println("qual elemento deseja remover? ");
                    colecao.remove(teclado.nextInt());
                    break;
                case 4:
                    System.out.printf("maior elemento: %d \n", colecao.maiorValor());
                    break;
                case 5:
                    System.out.printf("menor elemento: %d \n", colecao.menorValor());
                    break;
                case 6:
                    colecao.imprime();
                    break;
                default:
                    System.out.println("operação inválida. tente novamente");
                    break;
            }
            menu.imprimeMenu();
            System.out.println("digite a operação desejada: ");
            seleciona = teclado.nextInt();
        }
        teclado.close();
    }
}