package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        double[] vectA = new double[n];
        for( int i=0; i<n; i++ ){
            System.out.println("Digite os valores do vetor A: ");
            vectA[i] = sc.nextDouble();
        }

        double[] vectB = new double[n];
        for( int i=0; i<n; i++ ){
            System.out.println("Digite os valores do vetor B: ");
            vectB[i] = sc.nextDouble();
        }

        double[] vectC = new double[n];
        for (int i=0; i<n; i++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("VETOR RESULTANTE");
       for(int i=0; i<n; i++){

           System.out.println(vectC[i]);
       }




        sc.close();
    }
}
