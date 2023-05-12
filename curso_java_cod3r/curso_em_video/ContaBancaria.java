import java.util.*;

public class ContaBancaria {
    public int numeroConta;
    protected String tipoConta;
    Usuario usuario;
    private double saldoConta;
    private boolean statusConta;

    Scanner teclado = new Scanner(System.in);
    
    /*construtor */
    public ContaBancaria(){
        this.statusConta = false;
        this.saldoConta = 0.0;
    }

    /*get e set do numero conta */
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    /*get e set do tipo conta */
    public String getTipoConta(){
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    /*get e set do saldo conta */
    public double getSaldoConta(){
        return this.saldoConta;
    }

    public void setSaldoConta(double saldoConta){
        this.saldoConta = this.saldoConta + saldoConta;
    }

    /*get e set do status conta */
    public boolean getStatusConta(){
        return this.statusConta;
    }

    public void setStatusConta(boolean statusConta){
        this.statusConta = statusConta;
    }

    /*método abre conta */
    public void abrirConta(String nome, String cpf, String dataNasc, String tipoConta){
        if(getStatusConta() == false){
            this.statusConta = true;
            this.usuario.setNomeUsuario(nome);
            this.usuario.setCpfUsuario(cpf);
            this.usuario.setDataNascimentoUsuario(dataNasc);
            
            this.setTipoConta(tipoConta);
            if(tipoConta == "cc"){
                this.setSaldoConta(50.00);
            }
            if(tipoConta == "cp"){
                this.setSaldoConta(150.00);
            }
            System.out.println("Conta aberta com sucesso. ");
        } else {
            System.out.println("A conta já existe. ");
        }
    }

    /*método de saque */
    public void sacar(double valorDeSaque){
        if(getStatusConta() == true){
            if((getSaldoConta() > 0) && (getSaldoConta() >= valorDeSaque)){
                setSaldoConta(valorDeSaque * -1);
                System.out.println("Saque realizado com sucesso. ");
            } else {
            System.out.println("Saldo insuficiente para saque. Tente novamente.");
            }
        } else {
            System.out.println("A conta não existe.");
        }
    }   

    /*método de depósito */
    public void depositar(double deposito){
        if(getStatusConta() == true){
            setSaldoConta(deposito);
            System.out.println("Valor depositado com sucesso.");
        } else {
            System.out.println("A conta não existe.");
        }
    }

    /*método para fechar a conta */
    public void fecharConta(){
        /*verifica se a conta existe */
        if(getStatusConta() == true){
            /*verifica se a conta possui algum valor */
            if(getSaldoConta() > 0){
                sacar(getSaldoConta());
                setStatusConta(false);
                System.out.println("Valor em conta sacado e conta encerrada com sucesso.");
                return;
            }
            /*verifica se a conta possui algum débito */
            else if(getSaldoConta() < 0){
                System.out.println("A conta possui débitos em aberto. Deseja quitar?");
                System.out.println("Digite 'S' para sim e 'N' para não.");
                String resposta = teclado.next();
                if(resposta.contains("S")){
                    depositar(getSaldoConta() * -1);
                    setStatusConta(false);
                    System.out.println("Conta encerrada com sucesso.");
                    return;
                }
                if(resposta.contains("N")){
                    System.out.println("Não foi possível encerrar a atividade da conta. ");
                    return;
                }
            }
            /*caso em que a conta está vazia */
            else {
                setStatusConta(false);
                System.out.println("Conta encerrada com sucesso.");
            }
        } else {
            System.out.println("A conta não existe.");
        }
    }    

    /*método para pagar mensalidade */
    public void pagarMensalidade(){
        if(getStatusConta() == true){
            /*mensalidade da conta corrente */
            if(getTipoConta().contains("cc")){
                setSaldoConta(-12.00);
             } if(getTipoConta().contains("cp")){
                setSaldoConta(-20.00);
            }
            System.out.println("Mensalidade paga com sucesso. ");
        } else {
            System.out.println("A conta não existe. ");
        }
    }

    /*extrato */
    public void extrato(){
        System.out.println("========== EXTRATO ==========");
        System.out.println("Cliente: " + usuario.getNomeUsuario());
        System.out.println("CPF: " + usuario.getCpfUsuario() + " | Data nasc.: " + usuario.getDataNascimentoUsuario());
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Tipo da conta: " + getTipoConta());
        System.out.println("Saldo: " + getSaldoConta());
        System.out.println("Status da conta: " + getStatusConta());
    }
}
