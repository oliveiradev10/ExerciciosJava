package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        double[] nm = new double[n];
        for (int i=0; i<n; i++){
            System.out.println("Digite um número: ");
            nm[i] = sc.nextDouble();

        }

        double maior = nm[0];
        int posicao = 0;


        for (int i=0; i<n; i++){
            if (nm[i] > maior){
                maior = nm[i];
                posicao = i;


            }
        }

        System.out.println("MAIOR VALOR: " + maior);
        System.out.println("POSICÃO: " + posicao);



        sc.close();
    }
}
