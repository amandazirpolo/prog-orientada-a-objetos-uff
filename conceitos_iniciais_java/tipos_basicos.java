package conceitos_iniciais_java;

public class tipos_basicos {
    public static void main(String[] args) {
        // informações do funcionario

        //tipos numericos inteiros
        byte anos_empresa = 23;
        short num_voos = 542;
        int id_funcionario = 56789;
        long pontos_acumulados = 678908;

        //tipos numericos reais
        double salario = 1891.98;
        double vendas_acumuladas = 29890.90;

        //tipo booleano
        boolean funcionario_ferias = false;

        //tipo caractere
        char status_funcionario = 'a'; // a = ativo e i = inativo

        // dias de empresa
        System.out.println(anos_empresa * 365);

        // numero de viagens
        System.out.println(num_voos / 2);

        // pontos por real
        System.out.println (pontos_acumulados / vendas_acumuladas);
        System.out.println(id_funcionario + ": ganha -> " + salario);
        System.out.println("Ferias? " + funcionario_ferias);
        System.out.println("Status funcionario: " + status_funcionario);

    }
} 