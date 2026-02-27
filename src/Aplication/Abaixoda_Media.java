package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Abaixoda_Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i=0; i<n; i++){
            System.out.println("DIGITE UM NUMERO: ");
            vect[i] = sc.nextDouble();

        }

        double soma = 0;
        for(int i=0; i<n; i++){
            soma = soma + vect[i];

        }

        double media = soma / n;
        System.out.printf("MEDIA DO VETOR: %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i=0; i<n; i++){
            if (vect[i] < media){
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        System.out.println("Qnt de elementos: ");
        int contador = 0;
        for (int i=0; i<n; i++){
            if (vect[i] < media){
                contador++;
            }

        }
            System.out.println(contador);




        sc.close();
    }
}
