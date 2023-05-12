public class Usuario {
    private String nomeUsuario;
    private String cpfUsuario;
    private String dataNascimentoUsuario; 

    /*métodos get e set */
    public String getNomeUsuario(){
        return this.nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario(){
        return this.cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario){
        this.cpfUsuario = cpfUsuario;
    }

    public String getDataNascimentoUsuario(){
        return this.dataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(String dataNascimentoUsuario){
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    /*método para instanciar as características do usuario */
    public void criaUsuario(String nomeUsuario, String cpfUsuario, String dataNascimentoUsuario){
        setNomeUsuario(nomeUsuario);
        setCpfUsuario(cpfUsuario);
        setDataNascimentoUsuario(dataNascimentoUsuario);
    }
}
