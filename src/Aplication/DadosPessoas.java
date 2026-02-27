package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();


        double[] altura = new double[n];
        sc.nextLine();
        String[] genero = new String[n];


        for(int i=0; i<n; i++){
            System.out.println("Altura da " + (i+1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("Genero da " + (i+1) + "a pessoa: ");
            genero[i] = sc.nextLine();
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        double somaAlturaMulheres = 0.0;
        int contadorMulheres = 0;
        int contadorHomens = 0;





        for (int i=0; i<n; i++){
            if ( altura[i] < menorAltura) {
                menorAltura = altura[i];
            } if ( altura[i] > maiorAltura){
                maiorAltura = altura[i];

            }if (genero[i].equals("F")) {
                somaAlturaMulheres = somaAlturaMulheres + altura[i];
                contadorMulheres++;

            } if(genero[i].equals("M")) {
                contadorHomens++;
            }

        }

        double media = 0.0;
        if (contadorMulheres > 0) {
                    media = somaAlturaMulheres / contadorMulheres;
        } else {
            System.out.println("Não pode dividir ! ");
        }


        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das alturas das mulheres: %.2f%n " , media);
        System.out.println("Homens: " + contadorHomens);


        sc.close();
    }
}
