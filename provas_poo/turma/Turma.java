package turma;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Turma {
    private String codigo;
    private String sala;
    private String horario;
    private Professor professor;
    private boolean aberta;

    ArrayList<Aluno> vetorAlunos = new ArrayList<Aluno>();

    public Turma(String codigo, String sala, String horario, Professor professor){
        this.codigo = codigo;
        this.sala = sala;
        this.horario = horario;
        this.professor = professor;
        this.aberta = true;
    }

    /*getters e setters dos atributos */
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    /*métodos de turma */
    public void preencheTurma(){
        Scanner teclado = new Scanner(System.in);
        int numeroAlunos;
        System.out.println("quantos alunos terão na turma?");
        numeroAlunos = teclado.nextInt();

        for(int i = 0; i < numeroAlunos; i++){
            String aluno;
            int matriculaAluno;
            System.out.println("entre com o nome e a matricula do aluno: ");
            aluno = teclado.next();
            matriculaAluno = teclado.nextInt();
            vetorAlunos.add(new Aluno(aluno, matriculaAluno));
        }
        teclado.close();
    }

    public void escreveArquivo() throws IOException{
        try{
            File arquivo = new File("informacoesTurma.txt");
            BufferedWriter escreve = new BufferedWriter(new FileWriter(arquivo));
            escreve.write("Turma: " + getCodigo() + " - Sala: " + getSala() + " - Horario: " + getHorario());
            escreve.newLine();
            escreve.write("Professor: " + professor.obterNomeProfessor() + " - Titulação: " + professor.obterTitulacao());
            escreve.newLine();
            for(int i = 0; i < vetorAlunos.size(); i++){
                escreve.write(vetorAlunos.get(i).obterNome() + " - " + vetorAlunos.get(i).obterMatricula());
                escreve.newLine();
            }
            escreve.close();
        } catch(IOException e){
            System.out.println("não foi possível escrever no arquivo. tente novamente.");
        }
    }
        
}
