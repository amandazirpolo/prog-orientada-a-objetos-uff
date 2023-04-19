package jogo_de_dados;

import java.util.Random;

public class Dado {
    private int valorDeFace;

    public int rolarDados(){
        Random rolar = new Random();
        valorDeFace = rolar.nextInt(6);
        return valorDeFace;
    }

    public int soma(int dado1, int dado2){
        return dado1 + dado2;
    }
    
    public int getValorDeFace(){
        return this.valorDeFace;
    }
}
