public class Produto {
    private int disponivelEmEstoque;
    private double preco;
    private String nome;

    public Produto(double preco, String nome){
        this.disponivelEmEstoque = 40;
        this.preco = preco;
        this.nome = nome;
    }

    /* getters and setters */
    public int getDisponivelEmEstoque(){
        return this.disponivelEmEstoque;
    }

    public void setDisponivelEmEstoque(int disponivelEmEstoque){
        this.disponivelEmEstoque = disponivelEmEstoque;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
