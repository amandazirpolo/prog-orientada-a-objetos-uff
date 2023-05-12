package aula_03;
// package curso_java_cod3r.curso_em_video.aula_02;

public class Main3 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.cor = "azul";
        // c1.ponta = 0.5;
        c1.carga = 80; /*posso mexer pois a classe caneta está
        sendo utilizada pela chasse main */
        c1.tampar();

        c1.status();
        // c1.rabiscar(); 
    }
}
