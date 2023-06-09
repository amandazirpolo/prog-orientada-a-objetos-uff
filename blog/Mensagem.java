import java.util.Date;
import java.util.ArrayList;

public class Mensagem {

    private Date dataCriacao;
    private String texto;
    private Usuario autor;
    public ArrayList<Comentario> comentarios = new ArrayList<Comentario>();

    public Mensagem(String texto, Usuario autor){
        this.dataCriacao = new Date();
        this.texto = texto;
        this.autor = autor;
    }

    /*gets e sets dos atributos */
    public Date getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getAutor() {
        return this.autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    /*metodos */
    public void exibirMensagem(){
        System.out.println("mensagem: " + getTexto());
        System.out.println("data da mensagem: " + getDataCriacao());
    }
}