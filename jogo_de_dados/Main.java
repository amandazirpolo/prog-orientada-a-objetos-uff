package jogo_de_dados;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Partida part = new Partida(1);

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do jogador: ");
            String nomeP = teclado.nextLine();
            Pessoa p = new Pessoa(nomeP);
            Jogador j = new Jogador(p, part);
            part.addJogador(j);
        }

        for(int i = 0; i < 3; i++){
            part.getJogador()[i].dado1.rolarDados();
            part.getJogador()[i].dado2.rolarDados();
            part.getJogador()[i].calculaPonto(part.getJogador()[i].dado1.getValorDeFace(), part.getJogador()[i].dado2.getValorDeFace());
            int pontoJogo = part.getJogador()[i].getPonto();

            System.out.println("jogadas: " + part.getJogador()[i].dado1.getValorDeFace() + " " + part.getJogador()[i].dado2.getValorDeFace());
            if ((part.getJogador()[i].getPonto() == 7) || (part.getJogador()[i].getPonto() == 11)){ 
                part.getJogador()[i].setVenceu();
                System.out.println("Jogador: " + part.getJogador()[i].getPessoa().getNome() + " - VENCEU!");
                break;
            }
            if((part.getJogador()[i].getPonto() == 2) || (part.getJogador()[i].getPonto() == 3) || (part.getJogador()[i].getPonto() == 12)){
                System.out.println("Jogador: " + part.getJogador()[i].getPessoa().getNome() + " - PERDEU!");
                break;
                
            }
            while(part.getJogador()[i].getVenceu() == false){
                part.getJogador()[i].dado1.rolarDados();
                part.getJogador()[i].dado2.rolarDados();
                part.getJogador()[i].calculaPonto(part.getJogador()[i].dado1.getValorDeFace(), part.getJogador()[i].dado2.getValorDeFace());

                System.out.println("jogadas: " + part.getJogador()[i].dado1.getValorDeFace() + " " + part.getJogador()[i].dado2.getValorDeFace());
                if (part.getJogador()[i].getPonto() == pontoJogo){ 
                    part.getJogador()[i].setVenceu();
                    System.out.println("Jogador: " + part.getJogador()[i].getPessoa().getNome() + " - VENCEU!");
                }
            }
        }

        teclado.close();
    }
}
