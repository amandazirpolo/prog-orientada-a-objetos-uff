public class Refeicao {
    
    private double pesoAlimento;

    public Refeicao(double pesoAlimento){
        this.pesoAlimento = pesoAlimento;
    }

    /* get e set do atributo pesoAlimento */
    void setPesoAlimento(double pesoAlimento){
        if(pesoAlimento >= 0){
            this.pesoAlimento = pesoAlimento;
        }
    }

    double getPesoAlimento(){
        return this.pesoAlimento;
    }

}
