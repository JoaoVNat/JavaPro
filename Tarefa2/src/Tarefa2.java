import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tarefa2 {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {

        /*
         * Exercício 1 – Resolva o problema usando recursão
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Adicione um número inteiro: ");
        int num = input.nextInt();
        int fator = 1;
        for (int i = 1; i <= num; i++) {
            fator *= i;
        }
        System.out.println("Fatorial de " + num + " é " + fator);




        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scan.nextInt();

     
        System.out.print("Top-Down: " + calcFatorTopDown(n));

        System.out.print(" ");


        System.out.print("Bottom-Up: " + calcFatorBottomUp(n));

        input.close();
        scan.close();

    }

    private static int calcFatorTopDown(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0 || n == 1) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int resul = n * calcFatorTopDown(n - 1);
        memo.put(n, resul);
        return resul;

    }

    private static int calcFatorBottomUp(int n) {
        if(n < 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }
        return dp[n];
    }


}