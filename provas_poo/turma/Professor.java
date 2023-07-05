package turma;

public class Professor {
    private String nomeProfessor;
    private String titulacao;

    public Professor(String nomeProfessor, String titulacao){
        this.nomeProfessor = nomeProfessor;
        this.titulacao = titulacao;
    }

    /* getters e setters dos atributos */
    public String obterNomeProfessor(){
        return this.nomeProfessor;
    }

    public void definirNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public String obterTitulacao(){
        return this.titulacao;
    }

    public void definirTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
}
