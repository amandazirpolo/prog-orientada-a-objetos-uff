public class Pessoa {
    
    private double peso;

    public Pessoa(double peso){
        this.peso = peso;
    }
    
    /* métodos get e set do atributo peso */
    double getPeso(){
        return this.peso;
    }

    void setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
        }
    }

    public void comer(Pessoa pessoa, Refeicao refeicao){
        double pesoPessoa = pessoa.getPeso();
        pessoa.setPeso(pesoPessoa + refeicao.getPesoAlimento());
    }
}
