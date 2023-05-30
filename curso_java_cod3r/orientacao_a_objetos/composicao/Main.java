package curso_java_cod3r.orientacao_a_objetos.composicao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Amanda Zirpolo");

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adicionaItem(new Produto("caneta", 2.99, 0001), 2);
        compra2.adicionaItem(new Produto("caderno", 15.50, 0002), 3);

        cliente1.adicionarCompra(compra1);
        cliente2.adicionarCompra(compra2);

        System.out.println(cliente1.obterValorTotal());
    }
}
