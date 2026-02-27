package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println("VALORES DIGITADOS = ");
        for (int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        double soma = 0.0;
        for (int i=0; i<vect.length; i++){
            soma += vect[i];
        }



        System.out.println("SOMA " + soma);

        double media = soma/ n;
        System.out.println("MEDIA " + media);


        sc.close();
    }
}
