package curso_java_cod3r.classes_e_metodos.desafio_produto;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);
        Produto produto1 = new Produto();
        produto1.nome = "Arroz";
        produto1.preco = 25.99;
        produto1.desconto = 0.25;

        Produto produto2 = new Produto();
        produto2.nome = "Feijão";
        produto2.preco = 6.99;
        produto2.desconto = 0.1;

        double desconto1 = produto1.precoComDesconto();
        double desconto2 = produto2.precoComDesconto();

    }
}
