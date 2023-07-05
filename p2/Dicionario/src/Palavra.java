import java.util.ArrayList;

public class Palavra {
    
    String fonetica;
    String grafia;
    ArrayList<Sinonimos> listaSinonimos = new ArrayList<>();

    public Palavra(String fonetica, String grafia){
        this.fonetica = fonetica;
        this.grafia = grafia;
    }

    public void getSinonimos(Palavra palavra){
        System.out.printf("%s: \n", palavra.grafia);
        for(int i = 0; i < listaSinonimos.size(); i++){
            System.out.println("Significados: ");
            System.out.printf("%d - %s \n", i+1, listaSinonimos.get(i).significado);
        }
    }

    public void addSinonimo(Sinonimos sinonimo, Palavra palavra){
        listaSinonimos.add(sinonimo);
        sinonimo.addSinonimoPalavra(palavra);
    }
}
