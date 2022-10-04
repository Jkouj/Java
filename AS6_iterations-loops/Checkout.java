
/**
 * Checkout.java
 * Joey Koumjian
 * 6/23/22
 */
import java.util.Scanner;
public class Checkout
{
    public static void Checkout(){
        //Create Scanner object and print greeting.
        System.out.println("KowMart express self-checkout (10 item limit)");
        
        //Ask how many items
        int items;
        do {
                Scanner keyboard = new Scanner(System.in);
        	System.out.println("How many items (1-10)?");
        	items = keyboard.nextInt();
        } while(items < 1 || items > 10);
        
        //Add up the cost of each item (while loop, repeat items times)
        double cost = 0;
        double sum = 0;
        int i = 0;
        do {
                Scanner keyboard = new Scanner(System.in);
        	System.out.println("Cost of next item:");
        	cost = keyboard.nextDouble();
        	sum = sum + cost;
        	i = i + 1;
        } while(i<items);
        
        //Ask if a bag is needed
        String ask;
        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Do you want a bag");
            ask = keyboard.nextLine();
            if (ask.equals("yes") && (items <= 3)){
                sum = sum + 0.05;
            }
        } while (!ask.equalsIgnoreCase("yes") && !ask.equalsIgnoreCase("no"));

        
        //Add in tax.
        sum = sum*1.06;
        
        //print out the total.
        System.out.printf("Your total with 6 %% sales tax is $%1.2f\n",sum);

    }
}
