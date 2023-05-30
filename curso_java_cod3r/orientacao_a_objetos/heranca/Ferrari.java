package curso_java_cod3r.orientacao_a_objetos.heranca;

public class Ferrari extends Carro {

    public Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
    }
    
    public void acelerar(Ferrari ferrari){
        super.acelerar(ferrari);
        super.acelerar(ferrari);
        super.acelerar(ferrari);
    }

}
