public class Pessoa {
    private Mae mae;
    private Pai pai;
    private String nome;
    private int idade;

    public Pessoa(Mae mae, Pai pai, String nome, int idade){
        this.mae = mae;
        this.pai = pai;
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }
    
    public Mae getMae() {
        return this.mae;
    }

    public String getNome() {
        return this.nome;
    }

    public Pai getPai() {
        return this.pai;
    }
}
