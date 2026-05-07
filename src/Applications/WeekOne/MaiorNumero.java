package Applications.WeekOne;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um numero: ");
        int x = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int y = sc.nextInt();

        System.out.println("ESCOLHA SUA OPERAÇÃO (+ - * /): ");
        char op = sc.next().charAt(0);

        double resultado;

        if (op == '+') {
            resultado = x + y;
        } else if (op == '-') {
            resultado = x - y;
        } else if (op == '*') {
            resultado = x * y;
        } else if (op == '/') {

        if (y != 0) {
            resultado = x / y;
        } else {
            System.out.println("Erro divisão por 0");
            return;
        }
        } else {
            System.out.println("Operação inválida! ");
            return;
        }

        System.out.println("Resultado: " + resultado);




        sc.close();
    }
}
