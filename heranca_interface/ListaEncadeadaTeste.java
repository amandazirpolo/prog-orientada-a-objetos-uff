// package heranca_interface;

public class ListaEncadeadaTeste {
    private int info;
    private ListaEncadeadaTeste prox;

    public ListaEncadeadaTeste(){
        this.info = null;
        this.prox = null;
    }

    private ListaEncadeadaTeste(int elemento){
        this.info = elemento;
    }

    public void insere(int elemento){
        if(this.prox != null){
            insere(elemento);
            return;
        }
        this.prox = new ListaEncadeadaTeste(elemento);
    }

    public int busca(int elemento){
        ListaEncadeadaTeste lista = this;
        int i = 0;
        while(lista != null){
            if(lista.info == elemento){
                return i;
            }
            lista = lista.prox;
            i++;
        }
        return -1;
    }

    public void remove(int elemento){
        if(busca(elemento) != -1){
            ListaEncadeadaTeste lista = this;
            if((this.info == elemento) && (this.prox != null)){
                this.info = this.prox.info;
                this.prox = this.prox.prox;
                return;
            } 
            if(this.info == elemento){
                this.info = null;
                return;
            }
            this.prox.remove(elemento);
            // while(lista.prox != null){
            //     if(lista.prox.info == elemento){
            //         lista.prox = lista.prox.prox;
            //     }
            //     lista = lista.prox;
            // }
        }
    }
}
