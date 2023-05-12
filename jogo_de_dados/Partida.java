package jogo_de_dados;

public class Partida {
    /*permite que o código acesse informações reais de data e hora da máquina */
    private Jogador[] jogadores = new Jogador[3];
    private int contador = 0;
    private int numPartida;

    /*construtor - executa a classe sem ter que chamar*/
    public Partida(int numPartida){
        this.numPartida = numPartida;
    }

    public int getNumPartida(){
        return this.numPartida;
    }

    public void addJogador(Jogador jogador){
        if(contador < jogadores.length){
            jogadores[contador] = jogador;
            this.contador++;
        }
    }

    public void resetPartida(){
        this.contador = 0;
    }

    public Jogador[] getJogador(){
        return this.jogadores;
    }
}

