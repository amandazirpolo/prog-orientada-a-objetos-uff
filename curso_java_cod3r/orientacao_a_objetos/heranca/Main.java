package curso_java_cod3r.orientacao_a_objetos.heranca;

public class Main {
    
    public static void main(String[] args) {

        /*iniciando os objetos civic e ferrari*/
        Carro civic = new Civic(180.00);
        Carro ferrari = new Ferrari(300.00);

        /*acelerando o civic */
        civic.acelerar(civic);
        civic.acelerar(civic);
        civic.acelerar(civic);
        civic.acelerar(civic);

        /*acelerando a ferrari */
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);

        /*velocidade do civic */
        System.out.println("velocidade do civic: " + civic.getVelocidadeAtual());

        /*velocidade da ferrari */
        System.out.println("velocidade da ferrari: " + ferrari.getVelocidadeAtual());

        /*freando o civic */
        civic.frear(civic);
        civic.frear(civic);
        civic.frear(civic);
        civic.frear(civic);
        civic.frear(civic);

        /*freando a ferrari */
        ferrari.frear(ferrari);

        /*velocidade do civic */
        System.out.println("velocidade do civic depois de frear: " + civic.getVelocidadeAtual());

        /*velocidade da ferrari */
        System.out.println("velocidade da ferrari depois de frear: " + ferrari.getVelocidadeAtual());
    }

}
