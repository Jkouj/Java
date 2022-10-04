
 /**
    Joey Koumjian
   */
  
import java.util.*;
public class PennyChanger
{
    public static void main(String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)
        
        change(75);
        change(43);
        change(24);
        
    }
    public static void change(int pennies){
        int leftover_pennies,  // the number of each coin we have 
        quarters, dimes, nickels;
        
        System.out.print(pennies + " cents = ");
         // find how many quarters are in pennies
        quarters = pennies / 25;  // fix this
        // find how many pennies are leftover after removing the quarters
        leftover_pennies = pennies - (quarters*25); // fix this
        //System.out.println(leftover_pennies);
        // find how many dimes are in leftover_pennies
        dimes = leftover_pennies / 10; // fix
        // find how many pennies are leftover after removing the dimes
        leftover_pennies = leftover_pennies - (dimes*10);
        // find how many nickels are in leftover_pennies
        nickels = leftover_pennies / 5;
        // find how many pennies are leftover after removing the nickels
        leftover_pennies = leftover_pennies - (nickels * 5);
        System.out.print(quarters + " quarters, " + dimes + " dimes, "); 
        System.out.println(nickels + " nickels, " + leftover_pennies + " pennies.");        
        
    }    
}
/*
 * 75 cents = 3 quarters, 0 dimes, 0 nickels, 0 pennies.
 * 43 cents = 1 quarters, 1 dimes, 1 nickels, 3 pennies.
 * 24 cents = 0 quarters, 2 dimes, 0 nickels, 4 pennies.
 */