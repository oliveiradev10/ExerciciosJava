package Applications.WeekOne;

import java.util.Locale;
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o seu salário, você irá ganhar um bônus: ");
        double salary = sc.nextDouble();

        double bonus = (salary / 100) * 10.0 + salary;
        System.out.println("Parabéns o seu salário aumentou 10% e agora você ganha: " + bonus);

        sc.close();

    }
}
