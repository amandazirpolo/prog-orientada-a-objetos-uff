package lista_um.exercicio_um;

/*métodos são públicos e atributos são privados */

public class Produto {
    private float valor;
    private String descricao;
    private int quantidadeEstoque;

    /*construtor */
    public Produto(float valor, String descricao, int quantidadeEstoque){
        this.valor = valor;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /*métodos get e set */ 

    // get: retorna o valor de um atributo
    public float getValor(){
        return this.valor;
    }

    // set: muda/define o valor de um atributo
    public void setValor(float valor){
        this.valor = valor;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
