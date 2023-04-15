package codigos_aula;

import java.util.Scanner;

public class exercicio12_04 {

    
    public static int compara_times(int[] time1, int[] time2){
        // pg, v, sg, gp
        if(time1[0] > time2[0]){
            return 1;
        } else if(time1[0] < time2[0]) {
            return -1;
        }
        if(time1[2] > time2[2]){
            return 1;
        }
        else if(time1[2] < time2[2]){
            return -1;
        }
        if(time1[3] > time2[3]){
            return 1;
        } else if(time1[3] < time2[3]){
            return -1;
        }
        if(time1[4] > time2[4]){
            return 1;
        }
        else if(time1[4] < time2[4]){
            return -1;
        }
        return 0;
    }

    public static void preenche_matriz(int[][] mat, int qtd){
        int n;
        Scanner ler_dados = new Scanner(System.in);
        System.out.println("dados do time: pontos ganhos - jogos - vitorias - saldo de gols - gols proprios");
        for(int i = 0; i < qtd; i++){
            System.out.println("time " + i + ":");
            for(int j = 0; j < 5; j++){
                n = ler_dados.nextInt();
                mat[i][j] = n;
            }
        }
        ler_dados.close();
    }

    public static int time_lider(int[][] mat, int num){
        int i_vencedor = 0;
        for(int i = 1; i < num; i++){
            int comp = compara_times(mat[i_vencedor], mat[i]);
            if(comp < 0){
                i_vencedor = i;
            };
        }
        return i_vencedor;
    }
    
    public static void imprime_matriz(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int num_times, vencedor;
        
        Scanner le_dados = new Scanner(System.in);
        System.out.println("entre com a quantidade de times: ");
        num_times = le_dados.nextInt();
        
        int[][] matriz = new int[num_times][5];
        
        preenche_matriz(matriz, num_times);
        vencedor = time_lider(matriz, num_times);

        System.out.println("o time vencedor é o time " + vencedor);

        le_dados.close();
    }
}
