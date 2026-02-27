package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new  Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) +"o aluno");
            name[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
             nota2[i] = sc.nextDouble();
             sc.nextLine();


        }


        for (int i=0; i<n; i++){
            if ((nota1[i] + nota2[i]) / 2.0 >= 6.0){
                System.out.println(name[i]);
            }

        }



        sc.close();
    }
}
