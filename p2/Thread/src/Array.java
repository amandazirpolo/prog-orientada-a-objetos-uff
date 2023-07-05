import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    
    ArrayList<Double> listaValores;
    Double result = null;

    public Array(){
        listaValores = new ArrayList<>();
    }

    public ArrayList<Double> preencheArray(int n){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("digite um elemento: ");
            Double tmp = teclado.nextDouble();
            listaValores.add(tmp);
        }
        teclado.close();
        return listaValores;
    }
}
