import java.util.Scanner;
/**
 * Write a description of class PairOfDiceTestApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PairOfDiceTestApp
{
    public static void main(String [] args)
    {
       /*********** Problem 6 ******************************
       //  Do problems 1-4 in the PairOfDice class first
       // 6) Verify your class works by running this program 
       PairOfDice dice1 = new PairOfDice();       
       dice1.print();
        
       PairOfDice dice2 = new PairOfDice(3, 4);
       dice2.print();        
        
       //***************** end problem 6 ********************/
       /************ Problem 7 ******************************
       // 7) Add a getTotal method to the PairOfDice class that
       //    returns the sum of the two die instance variables 
       //    of a dice object. 
       //
       // Then use your new method in two print statements below 
       // to print the totals for your dice1 and dice2 objects 
       //  (should be 2 and 7)
       
       // System.out.println("the total value of dice1 = "  ///finish me);
       
       //***************** end problem 7 *******************/
       /************ Problem 8 ******************************
       // 8) Add code to compare the totals of two dice objects
       //    and print the object that has the higher total
       
       
       
       //***************** end problem 8 *******************/
       /************ Problem 9 ******************************
       // Add a void roll method to the PairOfDice class 
       //  (see assignment handout for instructions) 
       // Execute the following statements to make sure your
       // roll method works right
        
       dice1.roll();    
       System.out.print("rolling....dice1 ");
       dice1.print();
       
       dice2.roll();
       System.out.print("rolling....dice2 now = ");
       dice2.print();       

       dice1.roll();    
       System.out.print("rolling....dice1 now = ");
       dice1.print();
       
       dice2.roll();
       System.out.print("rolling....dice2 now = ");
       dice2.print();
       
       //***************** end problem 9 *******************/
       /************ Problem 10 ******************************
       // Challenge: Write a do-while loop that rolls dice1 
       // until a value of 12 (boxcars!) is rolled, and after the loop, 
       // print the number of rolls it took to get boxcars. 
       
       
       //***************** end problem 10 *******************/
       /************ Problem 11 ******************************
       // Extra Challenge: Write a do-while loop that rolls BOTH dice1 
       // and dice2 until ONE or more of them has a value of 12, 
       // and after the loop, print which object, dice1 or dice2
       // (or both) rolled the 12. 
       
       
       //***************** end problem 11 *******************/       
    }
   
}
