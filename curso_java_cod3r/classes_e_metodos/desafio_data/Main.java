package curso_java_cod3r.classes_e_metodos.desafio_data;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Data data = new Data();
        
        int d, a;
        String m;
        
        System.out.println("digite uma data: \n");
    
        d = teclado.nextInt();
        m = teclado.next();
        a = teclado.nextInt();
    
        /*atribuindo valor aos atributos usando o método set */
        data.setDia(d);
        data.setMes(m);
        data.setAno(a);

        /*atribuindo valor de forma direta */
        data.dia = d;
        data.mes = m;
        data.ano = a;
    
        System.out.println(data.getDia() + " de " + data.getMes() + " de " +  data.getAno());
        teclado.close();
    }
}
