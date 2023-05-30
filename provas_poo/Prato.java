public class Prato {

    private String nomePrato;
    private double precoPrato;

    /*construtor de prato */
    public Prato(String nomePrato, double precoPrato){
        this.nomePrato = nomePrato;
        this.precoPrato = precoPrato;
    }
    
    /* gets e sets dos atributos */
    String getNomePrato() {
        return this.nomePrato;
    }

    void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    double getPrecoPrato() {
        return this.precoPrato;
    }

    void setPrecoPrato(double precoPrato) {
        this.precoPrato = precoPrato;
    }

    
}
