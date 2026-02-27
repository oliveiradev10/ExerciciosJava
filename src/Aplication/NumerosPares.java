    package Aplication;

    import java.util.Locale;
    import java.util.Scanner;

    public class NumerosPares {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Quantos números você vai digitar?");
            int n = sc.nextInt();

            int[] numeros = new int[n];



            for (int i=0; i<n; i++){
                System.out.println("Digite um numero: ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("NUMEROS PARES: ");

            int contador = 0;

            for(int i=0; i<n; i++){
                if (numeros[i] % 2 == 0){
                    System.out.print(numeros[i] + " ");
                    contador++;

                }
            }
            System.out.println();
            System.out.println("QUANTIDADE DE PARES = " + contador);



            sc.close();
        }
    }
