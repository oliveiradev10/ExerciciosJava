package Aplication;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros M E N e depois ler uma matriz de M linhas por N colunas contendo números
inteiros podendo haver repetições. Em seguida ler um numero inteiro X que pertence a matriz. Para cada ocorrência de X,
mostrar os valores a esquerda, acima, a direita e abaixo de x, quando houver.
*/

public class ExercicioMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
            int x = sc.nextInt();

            for(int i=0; i<M; i++) {
                for (int j = 0; j < N; j++) {

                    if (mat[i][j] == x) {
                        System.out.println("Position: " + i + ", " + j);

                        if (j > 0) {
                            System.out.println("Left: " + mat[i][j - 1]);

                        }
                        if (j < N - 1) {
                            System.out.println("Right: " + mat[i][j + 1]);

                        }
                        if (i > 0) {
                            System.out.println("Up: " + mat[i - 1][j]);
                        }
                        if (i < M - 1) {
                            System.out.println("Down: " + mat[i + 1][j]);
                        }
                    }
                }
            }


            sc.close();







}
}
