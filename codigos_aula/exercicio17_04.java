package codigos_aula;

import java.util.Random;

/*Escreva um programa em Java que simule um jogo de dados.
Lançamento inicial:
Se o lançador tirar um 7 ou 11 no primeiro lançamento, vence o jogo.
Se os dados somarem 2, 3 ou 12, o jogador perde o jogo.
Qualquer outro número que saia no lançamento inicial (4, 5, 6, 8, 9, ou 10) se
torna o seu “Ponto”.
Os lançamentos continuam até que:
• O Ponto sair antes de um 7, e assim o jogador vence.
• O 7 sair antes do Ponto, e assim o jogador perde. */

public class exercicio17_04 {

    public static void verifica(int jogador){
        if(jogador == 1){
            System.out.println("status do jogador: ganhou");
        } else {
            System.out.println("status do jogador: perdeu");
        }
    }

    public static int soma(int dado1, int dado2){
        return dado1 + dado2;
    }

    public static int joga_dados(int dado){
        Random numero_dado = new Random();
        dado = numero_dado.nextInt(6);
        return dado;
    }

    public static int partida_dados(int dado1, int dado2){
        boolean jogador = true;
        dado1 = joga_dados(dado1); // sorteia o dado do primeiro jogador
        dado2 = joga_dados(dado2); // sorteia o dado do segundo jogador
        
        int ponto = soma(dado1, dado2); // variaveis para contar o valor das jogadas de cada um
        System.out.println(ponto);

        if((soma(dado1, dado2)== 7) || (soma(dado1, dado2) == 11)){
            return 1; /*se a soma dos dados do primeiro lancamento for igual a 7 ou 11,
                        jogador se torna false e a funcao retorna 1, pois o jogo foi ganho na
                        primeira rodada*/
        }
        if ((soma(dado1, dado2) == 2) || (soma(dado1, dado2) == 3) || (soma(dado1, dado2)== 12)){
            return 0; /*se a soma dos dados do primeiro lancamento for igual a 2, 3 ou 12,
                        jogador se torna false e a funcao retorna 0, pois o jogo foi perdido
                        na primeira rodada */
        }

        while(jogador){
            dado1 = joga_dados(dado1);
            dado2 = joga_dados(dado2);
            System.out.println("jogadas: " + dado1 + " " + dado2);
            if(soma(dado1, dado2) == 7){
                return 0;
            }
            if(soma(dado1, dado2) == ponto){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String []args){
        int jogador1, jogador2, dado1 = 0, dado2 = 0;

        System.out.println("jogador 1: ");
        jogador1 = partida_dados(dado1, dado2);
        verifica(jogador1);

        System.out.println("jogador 2: ");
        jogador2 = partida_dados(dado1, dado2);
        verifica(jogador2);
    }
}
