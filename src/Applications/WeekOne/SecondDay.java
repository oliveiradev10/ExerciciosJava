package Applications.WeekOne;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SecondDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Qual foi sua nota em matemática: ");
        double matematica = sc.nextDouble();
        System.out.print("Sua nota em português: ");
        double portugues = sc.nextDouble();
        System.out.print("Em fisica: ");
        double fisica = sc.nextDouble();

        double nota = (matematica + portugues + fisica) / 3;

        if (nota == 10.0) {
            System.out.println("PARABÉNS VOCÊ TIROU 10, ESTA APROVADO!!");
            System.out.println("-------------------------");
        } else if (nota >= 7.0 && nota <= 9.9) {
            System.out.print("Parabéns você esta aprovado !");
            System.out.println("-------------------------");
        } else if (nota >= 6.0 && nota <= 6.9) {
            System.out.println("Você esta de recuperação :( ");
            System.out.println("-------------------------");
        } else {
            System.out.println("Você esta reprovado ! estude mais ");
            System.out.println("-------------------------");

        }

        System.out.printf("Média final: %.2f%n", nota);
        sc.close();
    }
}
