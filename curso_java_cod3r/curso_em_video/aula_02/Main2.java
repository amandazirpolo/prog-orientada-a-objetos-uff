// package curso_java_cod3r.curso_em_video.aula_02;
package aula_02;

public class Main2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
    
        c1.cor = "azul";
        c1.ponta = 0.5;
        c1.tampada = false;
    
        c1.tampar();
        c1.status(); /*chamada do método */
        c1.rabiscar();
    
        Caneta c2 = new Caneta(); 
        c2.modelo = "bic";
        c2.cor = "preta";
        
        System.out.println();

        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
