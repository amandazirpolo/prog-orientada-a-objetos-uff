package jogo_de_dados;

public class Jogador {

    private Pessoa pessoa;
    private Partida partida;
    private int ponto;
    /*construtor*/
    private Jogador(){
    }

    public Jogador(Pessoa pessoa, Partida partida) throws Exception {
        if(pessoa != null){
            this.pessoa = pessoa;
        } else {
            throw new Exception("erro");
        }
    }
    
}
