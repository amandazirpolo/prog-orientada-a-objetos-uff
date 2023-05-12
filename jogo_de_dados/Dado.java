package jogo_de_dados;

import java.util.Random;

public class Dado {
    private int valorDeFace;

    public int rolarDados(){
        Random rolar = new Random();
        valorDeFace = rolar.nextInt(6);
        return valorDeFace;
    }
    
    /*pega o valor da face do dado */
    public int getValorDeFace(){
        return this.valorDeFace;
    }
}
