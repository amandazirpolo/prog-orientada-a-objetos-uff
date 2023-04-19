package jogo_de_dados;

public class Main {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        
        System.out.println("dado1 = " + dado1.rolarDados() + " dado2 = " + dado2.rolarDados());

        Partida partida = new Partida();
        System.out.println(partida.getData());
    }
}
