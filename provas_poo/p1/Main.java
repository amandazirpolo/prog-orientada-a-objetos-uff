import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
// import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws IOException {
        File arq = new File("colecaoPedidos.txt");
        BufferedReader leitor = new BufferedReader(new FileReader(arq));
        
        // ArrayList<Pedido> vetor = new ArrayList<Pedido>();
        Pedido pedido = new Pedido(arq);

        pedido.preencheArquivo(arq, leitor);
        double precoConta = pedido.valorConta();

        System.out.println("valor da conta: " + precoConta);

        pedido.imprime(pedido.calculaPorcentagem());

        leitor.close();
    }
}
