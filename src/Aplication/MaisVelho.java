package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.printf("Quantas pessoas você vai digitar ?  ");
        int n = sc.nextInt();

        String[] people = new String[n];
        int[] age = new int[n];

        for (int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + " pessoa");
            sc.nextLine();

            System.out.println("Nome:");
            people[i] = sc.nextLine();
            System.out.println("Idade:");
            age[i] = sc.nextInt();

        }
            int maiorIdade = age[0];
            int posicaoMaior = 0;
            for(int i=1; i<n; i++){
                if( age[i] > maiorIdade){
                    maiorIdade = age[i];

                    posicaoMaior = i;


                }

            }

        System.out.println("PESSOA MAIS VELHA =  " + people[posicaoMaior]);




        sc.close();
    }
}
