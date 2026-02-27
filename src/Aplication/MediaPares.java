package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for ( int i=0; i<n; i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int somaPares = 0;
        int quantidadePares = 0;


        for(int i=0; i<n; i++){
            if(vect[i] % 2 == 0){
                somaPares = somaPares + vect[i];
                quantidadePares++;
            }
        }
        double media = 0;

        if (quantidadePares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else{
            media = (double) somaPares / quantidadePares;
            System.out.printf(" MEDIA DOS PARES: %.1f%n", media);
        }

        sc.close();

    }
}
