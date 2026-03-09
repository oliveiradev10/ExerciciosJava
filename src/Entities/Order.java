package Entities;

import Entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;

        private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, Client client, OrderStatus status) {
        this.moment = moment;
        this.client = client;
        this.status = status;
    }

    public void addItem(OrderItem item){
            items.add(item);
        }

        public void removeItem(OrderItem item){
            items.remove(item);
        }


        public double total(){
            double sum = 0.0;
            for(OrderItem item : items){
                sum += item.subTotal();
            }
            return sum;
        }

        public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
            sb.append(moment + "\n");

            sb.append("Order status: ");
            sb.append(status + "\n");

            sb.append("Client: ");
            sb.append(client + "\n");

            sb.append("Order items:\n");

            for (OrderItem item : items){
                sb.append(item + "\n");
            }

            sb.append("Total price: $");
            sb.append(String.format("%.2f", total()));

            return sb.toString();

        }
}
