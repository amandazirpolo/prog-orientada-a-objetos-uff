package turma;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    /* getters e setters dos atributos */
    public int obterMatricula(){
        return this.matricula;
    }

    public void definirMatricula(int matricula){
        this.matricula = matricula;
    }

    public String obterNome(){
        return this.nome;
    }

    public void definirNome(String nome){
        this.nome = nome;
    }
}
