package curso_java_cod3r.orientacao_a_objetos.composicao;

import java.util.List;

public class Cliente {
    String nome;
    List<Compra> listaCompras = new List<Compra>;
    int contadorCompras = 0;

    Public Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.listaCompras.add(compra);
    }

    double obterValorTotal(){
        double total = 0;
        for(int i = 0; i < listaCompras.size(); i++){
            total += listaCompras.get(i).valorTotalCompra();
        }
        return total;
    }
}
