import java.util.ArrayList;

public class Dicionario {

    ArrayList<Palavra> listaPalavra;
    
    public Dicionario(){
        listaPalavra = new ArrayList<>();
    }

    public void addPalavra(Palavra palavra){
        listaPalavra.add(palavra);
    }

    public void getPalavras(Dicionario dicionario){
        for(int i = 0; i < listaPalavra.size(); i++){
            dicionario.listaPalavra.get(i).getSinonimos(dicionario.listaPalavra.get(i));
            System.out.println("------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Dicionario aurelio = new Dicionario();

        Palavra palavra1 = new Palavra("Vi - a - jou", "Viajou");
        Palavra palavra2 = new Palavra("Ma - io - ne - se", "Maionese");

        palavra1.addSinonimo(new Sinonimos("sair, passear"), palavra1);
        palavra1.addSinonimo(new Sinonimos("ir para outro planeta"), palavra1);

        palavra2.addSinonimo(new Sinonimos("comida, alimento"), palavra2);

        aurelio.addPalavra(palavra1);
        aurelio.addPalavra(palavra2);

        aurelio.getPalavras(aurelio);
    }
}
