// package curso_java_cod3r.curso_em_video.aula_02;
package aula_04;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    private int carga;
    private boolean tampada;
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }

    public Caneta(String m, String c, double p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public double getPonta(){
        return this.ponta;
    }
    
    public void setPonta(double p){
        this.ponta = p;
    }
    
    // public void rabiscar(){
    //     if(this.tampada == true){
    //         System.out.println("a caneta está tampada");
    //     } else {
    //         System.out.println("rabiscando");
    // }
    //     }
    
    
    public void status(){
        System.out.println("modelo: " + this.getModelo());
        System.out.println("cor da caneta: " + this.cor);
        System.out.println("a caneta está tampada? " + this.tampada);
        System.out.println("carga: " + this.carga);
        System.out.println("ponta: " + this.getPonta()); 
    }
}
