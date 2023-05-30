public class Main{

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(80.00);

        Refeicao arroz = new Arroz(0.225);
        Refeicao feijao = new Feijao(0.300);
        Refeicao sorvete = new Sorvete(0.500);

        p1.comer(p1, arroz);
        p1.comer(p1, sorvete);
        p1.comer(p1, feijao);

        System.out.println("peso final: " + p1.getPeso());           
    }
}