package curso_java_cod3r.orientacao_a_objetos.composicao;

public class Item {
    int quantidade;
    Produto produto = new Produto();

    public Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // metodo para retornar o valor total do produto * quantidade
    double valorItens(){
        double valorItem;
        valorItem = getQuantidade() * produto.getPreco();
        return valorItem;
    }
}
