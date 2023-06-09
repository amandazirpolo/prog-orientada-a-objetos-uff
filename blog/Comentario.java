public class Comentario extends Mensagem {
    
    Mensagem msg;

    public Comentario(Mensagem msg, String texto, Usuario autor){
        super(texto, autor);
        this.msg = msg;
    }
    
    public void comentar(String texto, Usuario autor){
        comentarios.add(new Comentario(msg, texto, autor));   
    }
}
