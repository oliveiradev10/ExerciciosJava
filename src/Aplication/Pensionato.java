package Aplication;
import Entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Rent[] quartos = new Rent[10];

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println();
            System.out.println("Rent #" + (i+1));                          
            System.out.println("Name: ");

            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            quartos[room] = new Rent(name, email);


        }

        System.out.println("Busy rooms: ");
        for (int i =0; i<quartos.length; i++){
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getName() + ", " + quartos[i].getEmail());


            }

        }


    }
}
