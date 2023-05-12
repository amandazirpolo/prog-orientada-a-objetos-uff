import java.util.Scanner;

public class Main05 {
    public static void menu(){
        System.out.println("1. abrir conta. ");
        System.out.println("2. sacar. ");
        System.out.println("3. depositar. ");
        System.out.println("4. extrato. ");
        System.out.println("5. pagar mensalidade.");
        System.out.println("6. encerrar conta.");
        System.out.println("7. sair");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria cliente01 = new ContaBancaria();
        
        menu();
        System.out.println("digite a operação desejada: ");
        int op = teclado.nextInt();
        while (op != 6){
            switch(op){
                case 1:
                    System.out.println("informe os dados do cliente: nome, cpf e data de nascimento. ");
                    String nome = teclado.next();
                    String cpf = teclado.next();
                    String dataNasc = teclado.next();
                    System.out.println("qual tipo de conta será aberta: c. corrente ou c. poupança? ");
                    String conta = teclado.next();
                    cliente01.abrirConta(nome, cpf, dataNasc, conta);
                    break;
                case 2:
                    System.out.println("qual valor deseja sacar: ?");
                    int aux = teclado.nextInt();
                    cliente01.sacar(aux);
                    break;
                case 3:
                    System.out.println("qual valor deseja depositar: ?");
                    aux = teclado.nextInt();
                    cliente01.sacar(aux);
                    break;
                case 4:
                    cliente01.extrato();
                    break;
                case 5:
                    cliente01.pagarMensalidade();
                    break;
                case 6:
                    cliente01.fecharConta();
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente. ");
                    break;
            }
            menu();
            System.out.println("digite a operação desejada: ");
            op = teclado.nextInt();
        }
        teclado.close();
    }
}
