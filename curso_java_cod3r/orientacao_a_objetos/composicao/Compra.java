package curso_java_cod3r.orientacao_a_objetos.composicao;

import java.util.List;

public class Compra {
    double valorTotal;
    Item item = new Item();
    List<Item> listaItens = new List<Item>;

    void adicionaItem(Produto p, int quantidade){
        this.listaItens.add(new Item(p, quantidade));
    }

    void adicionaProduto(String nomeProduto, double preco, int codigo, int quantidade){
        var produto = new Produto(nomeProduto, preco, codigo)
        this.listaItens.add(new Item(produto, quantidade));
    }

    // metodo para retornar o valor total da compra
    double valorTotalCompra(){
        double valor = 0;
        for(int i = 0; i < listaItens.size(); i++){
            valor += listaItens.get(i).valorItens();
        }
        return valor;
    }
}
