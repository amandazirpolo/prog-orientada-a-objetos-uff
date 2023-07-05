import java.io.BufferedReader;
// import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class Pedido {
    
    ArrayList<Item> vetorPedidos = new ArrayList<Item>();
    File arquivo;
    Pedido pedido;

    public Pedido(File arquivo){
        this.arquivo = arquivo;
    }

    public Pedido getPedido(){
        return this.pedido;
    }

    public ArrayList<Item> getVetorPedidos() {
        return this.vetorPedidos;
    }

    // public void percorre(){
    //     Pedido aux = this.pedido;
    //     while(aux.getPedido() != null){
    //         System.out.println(aux.getVetorPedidos());
    //         aux = aux.getPedido();
    //     }
    // }

    public void preencheArquivo(File arquivo, BufferedReader leitor) throws IOException {
        try {
            String linha;
            while((linha = leitor.readLine()) != null){
                // if(linha != "/"){
                    String[] separa = linha.split("-");
                    Item aux = new Item(new Prato(separa[0], Double.parseDouble(separa[2])), Integer.parseInt(separa[1]));
                    vetorPedidos.add(aux);
                // } else {
                //     leitor.readLine(); // pula a barra
                //     preencheArquivo(arquivo, leitor);
                // }
            }
            // if(leitor.readLine() == null){
            //     this.pedido = null;
            // }
        } catch(IOException e){
            System.out.println("não foi possível abrir o arquivo, tente novamente.");
        }
    }

    public Double valorConta(){
        Double valor = 0.0;
        for(int i = 0; i < vetorPedidos.size(); i++){
            valor += vetorPedidos.get(i).getQuantidade() * vetorPedidos.get(i).getPrato().getPrecoPrato();
        }
        return valor;
    }

    private int contaPedidos(){
        int total = 0;
        for(int i = 0; i < vetorPedidos.size(); i++){
            total += vetorPedidos.get(i).getQuantidade();
        }
        return total;
    }

    public ArrayList<Double> calculaPorcentagem(){
        ArrayList<Double> porcentagem = new ArrayList<Double>();
        int pedidos = contaPedidos();
        System.out.println(pedidos);
        for(int i = 0; i < vetorPedidos.size(); i++){
            Double aux = (100.00 * vetorPedidos.get(i).getQuantidade()) / pedidos;
            porcentagem.add(aux);
        }
        return porcentagem;
    }

    public void imprime(ArrayList<Double> lista){
        for(int i = 0; i < vetorPedidos.size(); i++){
            System.out.printf("%s - %.2f \n", vetorPedidos.get(i).getPrato().getNomePrato(), lista.get(i));
        }
    }

}
