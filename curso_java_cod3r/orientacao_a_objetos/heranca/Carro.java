package curso_java_cod3r.orientacao_a_objetos.heranca;

public class Carro {

    private double velocidadeAtual;
    private final double VELOCIDADE_MAXIMA;

    public Carro(double velocidadeMaxima){
        this.velocidadeAtual = 0.0;
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    /*get e set velocidade atual */
    void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    /*métodos da classe carro */
    public void acelerar(Carro carro){
        if(carro.getVelocidadeAtual() + 5 > VELOCIDADE_MAXIMA){
            carro.setVelocidadeAtual(VELOCIDADE_MAXIMA);
        } else {
            carro.setVelocidadeAtual(carro.velocidadeAtual + 5);
        }
    }

    public void frear(){
        if(this.velocidadeAtual >= 5){
            this.velocidadeAtual -=5
        } else {
            this.velocidadeAtual = 0.0;
        }
    }
}
