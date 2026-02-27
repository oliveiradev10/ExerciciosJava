package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProblemAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for( int i=0; i<n; i++) {
            System.out.println("Dados da "+ (i+1) + " Pessoa: ");
            sc.nextLine(); // limpa buffer

            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

        }
        double soma = 0.0;
        for( int i=0; i<alturas.length; i++){
            soma += alturas[i];
        }

        double media = 0.0;
        media = soma/n;
        System.out.printf("MEDIA: %.2f%n", media);

        int menores = 0;
        for (int i=0; i<n; i++){
            if (idades[i] < 16){
                menores++;
            }
        }
        double porcentagem = (menores * 100.0) / n;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", porcentagem);


            for(int i=0; i<n; i++){
                if (idades[i] < 16){
                    System.out.println(names[i]);
                }
            }


        sc.close();

    }
}
