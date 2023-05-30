public class Item {

    private Prato prato;
    private int quantidade;

    public Item(Prato prato, int quantidade){
        this.prato = prato;
        this.quantidade = quantidade;
    }
    
    /* gets e sets dos atributos */
    public Prato getPrato(){
        return this.prato;
    }

    public void setPrato(Prato prato){
        this.prato = prato;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int quantidade){
        /*impossivel receber 0 pratos */
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }

}
