import java.util.Date;
import java.util.ArrayList;

public class Blog {

    private Date dataCriacao;
    private String titulo;
    private Usuario dono;
    ArrayList<Nota> notas = new ArrayList<Nota>();

    public Blog(String titulo, Usuario dono){
        this.dataCriacao = new Date();
        this.dono = dono;
        this.titulo = titulo;
    }

    /*gets e sets */
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getDono() {
        return dono;
    }

    /*metodos */
    public void criarNota(Usuario autor, String texto){
        if(dono.getEmail() == autor.getEmail()){
            notas.add(new Nota(texto, autor));
        } else {
            System.out.println("permissão não concedida para o usuario.");
        }
    }

    public void exibirConteudo(Mensagem msg){
        msg.exibirMensagem();
    }

    public void lerNotas(){
        System.out.println("Blog: " + getTitulo());
        System.out.println("Notas: ");
        for(int i = 0; i < notas.size(); i++){
            notas.get(i).exibirMensagem();
        }
    }


    public void removerConteudo(Usuario autor, Mensagem msg){
        if(dono.getEmail() == autor.getEmail()){
            notas.remove(msg);
            autor.notificarExclusao(msg);
        } 
        else {
            System.out.println("permissão não concedida para o usuario.");
        }
    }
    
}