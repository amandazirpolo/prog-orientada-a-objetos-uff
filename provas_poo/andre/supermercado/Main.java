public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("débito");

        p1.preencheVetor();

        System.out.println("valor da compra: " + p1.valorCompra());
    }
}
