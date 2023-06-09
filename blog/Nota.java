import java.util.ArrayList;

public class Nota extends Mensagem {
    
    private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();

    public Nota(String texto, Usuario autor){
        super(texto, autor);
    }

    /*get e set de comentario*/
    public ArrayList<Comentario> getComentarios() {
        ArrayList<Comentario> copia = new ArrayList<Comentario>();
        copia = comentarios;
        return copia;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    /*metodos */
    public void comentarNota(Mensagem msg, String texto, Usuario autor){
        if(msg.getAutor().getEmail() == autor.getEmail()){
            comentarios.add(new Comentario(msg, texto, autor));
        }
        else {
            System.out.println("permissão não concedida.");
        }
    }

    public void lerComentarios(Mensagem msg){
        System.out.println("comentarios da msg: " + msg.getTexto());
        for(int i = 0; i < comentarios.size(); i++){
            comentarios.get(i).exibirMensagem();
        }
    }

}
