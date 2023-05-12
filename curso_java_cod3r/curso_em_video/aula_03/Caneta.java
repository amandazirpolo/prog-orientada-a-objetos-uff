// package curso_java_cod3r.curso_em_video.aula_02;
package aula_03;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor da caneta: " + this.cor);
        System.out.println("a caneta está tampada? " + this.tampada);
        System.out.println("carga: " + this.carga);
        System.out.println("ponta: " + this.ponta); 
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("a caneta está tampada");
        } else {
            System.out.println("rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
    
}
