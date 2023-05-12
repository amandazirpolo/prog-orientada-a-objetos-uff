// package curso_java_cod3r.curso_em_video.aula_02;
package aula_02;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor da caneta: " + this.cor);
        System.out.println("a caneta está tampada? " + this.tampada);
        System.out.println("carga: " + this.carga);
        System.out.println("ponta: " + this.ponta); 
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("a caneta está tampada");
        } else {
            System.out.println("rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
    
}
