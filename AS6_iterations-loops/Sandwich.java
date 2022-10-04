
/**
 * sandwich.java * 
 * Joey Koumjian
 * 6/22/22
 */
import java.util.Scanner;
public class Sandwich
{
    public static void burger()
    {   
        //Ask how much of the toppings the user wants (reject negative numbers)
        int lettuce;
        do {
            //Create a Scanner object for user input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("How many layers of lettuce do you want?");
            lettuce = keyboard.nextInt();
        }while(lettuce < 0);
            //end of asking for lettuce
            
            int tomatoes;
                do {
                //Create a Scanner object for user input
                Scanner keyboard = new Scanner(System.in);
            System.out.println("How many layers of tomatoes do you want?");
            tomatoes = keyboard.nextInt();
        }while(tomatoes < 0);
        //end of asking for tomatoes
        
        System.out.println("(__________)");
            //print bun
        
            int r = 0;
            while (r<lettuce) {
                System.out.println(" ~~~~~~~~~~");
                r = r + 1;
            }
            //end of lettuce printing
        int s = 0;
                while (s<tomatoes) {
                    System.out.println("    [][]");
                    s = s + 1;
            }
            //end of printing tomatoes
            System.out.println("(__________)");
            //print bun
    }
    public static void main(String []args) {
            //Print the Hamburger Palace sign.
        System.out.println("******************************");
        int line = 0;
        while(line < 5) {
            System.out.println("*                            *");
            line = line + 1;
        }
        System.out.println("* Dr. Kow's Hamburger Palace *");
        System.out.println("******************************");
        int i = 0;
        while (i<5) {
            System.out.println("*                            *");
            i = i + 1;
        }
        System.out.println("******************************");
        // end of sign
            
        int c = 0;
        while (c<5){
            System.out.println("Next customer!");
            burger();
            c = c + 1;
        }
    }
}
