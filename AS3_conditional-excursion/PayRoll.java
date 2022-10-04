import java.util.Scanner;


public class PayRoll
{
    public static void main (String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)

        payCheck( 40, 7.75);         // answer: $310
        
        payCheck( 20, 9.25);         // answer: $185 
        
        payCheck( 50, 12.50);        // answer: $687.50  
                                     // (the first 40 hours are paid at $12.50
                                     //  the next 10 hours are at $12.50*1.5)
                                     
        payCheck( 45, 15.00);        // answer: $712.50                                      
   
    }  
    // write your payCheck method here
    public static void payCheck(double hours, double rate) {
        double check;
        double overtime;
        if (hours <= 40) {
            check = hours * rate;
        }
        else {
            check = 40*rate;
            hours = hours - 40;
            check = check + (hours*rate*1.5);
        }
        System.out.println("The paycheck is: $"+check);
    }
}
/*
 * The paycheck is: $310.0
 * The paycheck is: $185.0
 * The paycheck is: $687.5
 * The paycheck is: $712.5
 */