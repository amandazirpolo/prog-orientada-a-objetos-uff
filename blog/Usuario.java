public class Usuario {
     
    private String email;

    public Usuario(String email){
        this.email = email;
    }

    /*get e set de email */
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void notificarExclusao(Mensagem msg){
        System.out.println(msg.getAutor() + "removeu seu conteudo.");
    }
}