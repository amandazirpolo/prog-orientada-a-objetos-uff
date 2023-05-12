package lista_um.exercicio_um;

public class Cliente {
    private Produto produto;
    private int quantidade;
    private String formaDePagamento;

    /*construtor */
    public Cliente(Produto produto, int quantidade, String formaDePagamento){
        this.produto = produto;
        this.quantidade = quantidade;
        this.formaDePagamento = formaDePagamento;
    }

    /* funções get e set */
    public Produto getProduto(){
        return this.produto;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public int getQuantidade(){
        return this.getQuantidade();
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String getFormaDePagamento(){
        return this.formaDePagamento();
    }

    public void setFormaDePagamento(String formaDePagamento){
        this.formaDePagamento = formaDePagamento;
    }
}
