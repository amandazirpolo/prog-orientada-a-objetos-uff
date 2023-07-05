public class Itens {
    private Produto produto;
    private int quantidadeItem;

    public Itens(Produto produto, int quantidadeItem){
        this.produto = produto;
        this.quantidadeItem = quantidadeItem;
    }

    /*getters and setters */
    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeItem() {
        return this.quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
}