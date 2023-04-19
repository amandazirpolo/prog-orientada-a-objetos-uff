import java.util.Calendar;

public class Partida {
    /*permite que o código acesse informações reais de data e hora da máquina */
    private Date data;
    private Jogador[] jogadores = new Jogador[10];

    /*construtor - executa a classe sem ter que chamar*/
    public Partida(){
        data = Calendar.getInstance(null, null).getTime();
    }

    public void addJogador(Jogador jogador){
        for(int i = 0; i < jogadores.length; i++){
            if(jogadores[i] == null){
                jogadores[i] = jogador;
            }
        }
    }

    public Jogador getJogador(){
        return this.jogadores;
    }

    public Date getData(){
        return this.data;
    }
}
