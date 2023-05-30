import java.io.IOException;
import java.io.File;

public class Main {
    
    public static void main(String[] args) throws IOException {
        File arq = new File("colecaoPedidos.txt");
        Pedido pedido = new Pedido(arq);

        pedido.preencheArquivo(arq);
        double precoConta = pedido.valorConta();

        System.out.println("valor da conta: " + precoConta);

        pedido.imprime(pedido.calculaPorcentagem());
    }
}
