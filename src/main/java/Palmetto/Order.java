package Palmetto;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;

public class Order {

    public static void main (String [] args){
        Order order1 = new Order("Client_1");
        order1.set = new Pizza[2];
        order1.set[0] = new Pizza("Margarita", order1.clientName, 0, order1.orderNumber, order1.clientOrder, true);
        order1.set[0].addIngredient(0);
        order1.set[0].addIngredient(4);
        order1.set[0].addIngredient(6);
        order1.set[0].addIngredient(3);
        order1.set[0].amount = 2;
        order1.set[1] = new Pizza("PepperoniOro", order1.clientName, 1, order1.orderNumber, order1.clientOrder, false);
        order1.set[1].addIngredient(0);
        order1.set[1].addIngredient(4);
        order1.set[1].addIngredient(6);
        order1.set[1].addIngredient(7);
        order1.set[1].amount = 5;
        System.out.println(order1.toString());
        System.out.println("local time:" + order1.now.toString());

    }

    static int lastOrder=10001;
    static int lastClient=7700;
    int orderNumber;
    int clientOrder;
    String clientName;
    Pizza set[];
    LocalTime now;
    public Order (String clientName){
        orderNumber = ++lastClient;
        clientOrder = ++lastOrder;
        this.clientName = clientName;
        now = LocalTime.now();
    }


    public String toString() {
        String string = "";
        string = string.concat("*************************");
        string = string.concat("\n");

        string = string.concat("Заказ:"+ orderNumber);
        string = string.concat("\n");
        string = string.concat("Клиент:"+ clientOrder);
        string = string.concat("\n");
        for (int i=0; i<set.length; i++) {
            string = string.concat("Название: " + set[i].name);
            string = string.concat("\n");
            string = string.concat("------------------------------");
            string = string.concat("\n");
            if (set[i].isCazone) string = string.concat("Pizza Baze (Calzone)    1,50 €");
            else string = string.concat("Pizza Baze              1,00 €");
            string = string.concat("\n");
            if (set[i].ingridients[0]==1) {
                string = string.concat("Tomato Paste            1,00 €");
                string = string.concat("\n");
            }
            if (set[i].ingridients[1]==1) {
                string = string.concat("Cheese                  1,00 €");
                string = string.concat("\n");
            }
            if (set[i].ingridients[2]==1) {
                string = string.concat("Salami                  1,50 €");
                string = string.concat("\n");
            }
            if (set[i].ingridients[3]==1) {
                string = string.concat("Bacon                   1,20 €");
                string = string.concat("\n");
            }
            if (set[i].ingridients[4]==1) {
                string = string.concat("Garlic                  0,30 €");
                string = string.concat("\n");
            }
            if (set[i].ingridients[5]==1) {
                string = string.concat("Corn                    0,70 €");

                string = string.concat("\n");
            }
            if (set[i].ingridients[6]==1) {
                string = string.concat("Pepperoni               0,60 €");
                string = string.concat("\n");
            }
            if (set[i].ingridients[7]==1) {
                string = string.concat("Olives                  0,50 €");
                string = string.concat("\n");
            }
            string = string.concat("------------------------------");
            string = string.concat("\n");
            String sum = String.format(Locale.FRANCE,"Всего:   %19.2f €", set[i].getSum());
            string = string.concat(sum);
            string = string.concat("\n");
            sum = String.format("Кол-во:   %20d", set[i].amount);
            string = string.concat(sum);
            string = string.concat("\n");
            string = string.concat("------------------------------");
            string = string.concat("\n");
        }
        String temp = String.format(Locale.FRANCE,"Общая сумма:      %10.2f €", this.getSum());
        string = string.concat(temp);
        string = string.concat("\n");
        string = string.concat("*************************");
        string = string.concat("\n");
        return string;
    }
    public double getSum(){
        double sum  = 0;
        for (int i=0; i<set.length; i++){
            sum += (set[i].getSum()*set[i].amount);
        }
        return sum;
    }

}
