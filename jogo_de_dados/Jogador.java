package jogo_de_dados;

public class Jogador {

    private Pessoa pessoa;
    private Partida partida;
    private int ponto = 0;
    private boolean venceu = false;

    Dado dado1 = new Dado();
    Dado dado2 = new Dado();

    /*construtor*/
    public Jogador(Pessoa pessoa, Partida partida) throws Exception {
        try {
            this.pessoa = pessoa;
            this.partida = partida;
        } catch (Exception e) {
            throw new Exception ("dados incompatíveis com a entrada"); 
       }
    }

    public int getPartida(){
        return this.partida.getNumPartida();
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }

    public int getPonto(){
        return this.ponto;
    }

    public void calculaPonto(int dado1, int dado2){
        this.ponto = dado1 + dado2;
    }

    public Boolean getVenceu(){
        return this.venceu;
    }

    public void setVenceu(){
        this.venceu = true;
    }
    
}
