package Aplication;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;
import java.text.ParseException;


public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();


        System.out.println("Birth date: (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter the order data:");

        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), client, status);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Enter #" + i + "item data: ");
            sc.nextLine();

            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, price);

            OrderItem item = new OrderItem(quantity, product, price);

            order.addItem(item);

        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);





        sc.close();
    }
}
