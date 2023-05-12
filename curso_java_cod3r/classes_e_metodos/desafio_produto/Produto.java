package curso_java_cod3r.classes_e_metodos.desafio_produto;

/*classe.atributo.metodo();*/

public class Produto {

    /*atributos da classe */
    private String nome;
    private Double preco;
    private Double desconto;

    /*construtor */
    public Produto(String nome, Double preco, Double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double precoComDesconto(){
        return this.Produto.preco - (Produto.preco * Produto.desconto);
    }
}
