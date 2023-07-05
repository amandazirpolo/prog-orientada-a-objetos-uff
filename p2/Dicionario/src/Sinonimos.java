import java.util.ArrayList;

public class Sinonimos {

    String significado;
    ArrayList<Palavra> listaPalavrasIguais;

    public Sinonimos(String significado){
        this.significado = significado;
        listaPalavrasIguais = new ArrayList<>();
    }

    public void addSinonimoPalavra(Palavra palavra){
        listaPalavrasIguais.add(palavra);
    }
}
