import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private String formaPagamento;

    ArrayList<Itens> vetorItens = new ArrayList<Itens>();

    public Pedido(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    /*get and set */
    public String getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /* métodos */
    public void preencheVetor(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual a quantidade de itens?");
        int numItens = teclado.nextInt();
        for(int i = 0; i < numItens; i++){
            System.out.println("nome, preco e quantidade:");
            /* instancia as variaveis */
            String nomeP = teclado.next();
            Double precoP = teclado.nextDouble();
            int quantidadeP = teclado.nextInt();
            Produto p = new Produto(precoP, nomeP);
            /* verifica se tem a quantidade de unidades no estoque */
            if(quantidadeP < p.getDisponivelEmEstoque()){
                /* insere no vetor e atualiza a quantidade de unidades disponiveis */
                vetorItens.add(new Itens(new Produto(precoP, nomeP), quantidadeP));
                p.setDisponivelEmEstoque(p.getDisponivelEmEstoque() - quantidadeP);
            } else {
                i--;
                System.out.println("não tem produtos disponiveis o suficiente no estoque. \n");
            }
        }
        teclado.close();
    }

    public Double valorCompra(){
        Double total = 0.0;
        for(int i = 0; i < vetorItens.size(); i++){
            total += vetorItens.get(i).getQuantidadeItem() * vetorItens.get(i).getProduto().getPreco();
        }
        return total;
    }

}