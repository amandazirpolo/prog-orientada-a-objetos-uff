package jogo_de_dados;

public class Pessoa {
    
    private String nome;

    /*construtor */
    public Pessoa(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
