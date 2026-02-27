package Aplication;
import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();


        System.out.print("How many emploteers will be registered?   ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Emplyoee #" + (i + 1));

            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("ID already taken ! Try again: ");
                id = sc.nextInt();
            }

                sc.nextLine(); //Limpa buffer


                System.out.print("Name: ");
                //sc.nextLine();
                String name = sc.nextLine();


                System.out.print("Salário: ");
                double salario = sc.nextDouble();

                Employee f = new Employee(id, name, salario);
                list.add(f);

            boolean idExiste = false;

            /*  Outra forma de fazer( no lugar do while)
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getId() == id) {
                    idExiste = true;
                    break;
                }
            }

            if (idExiste) {
                System.out.println("ID já existe!");
                i--;

            } else {


                 } */
        }
        System.out.println();
        System.out.println("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();

        Employee f = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

       // Integer pos = position(list, idsalary);
        if ( f == null ){
            System.out.println("This is does not exist! ");
        }else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            f.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employeers: ");
        for(Employee emp: list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return f !=null;
    }

}
