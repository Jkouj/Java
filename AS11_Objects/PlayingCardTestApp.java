import java.util.Scanner;
/**
 * Write a description of class PlayingCardTestApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayingCardTestApp
{
    public static void main(String [] args){
       /*********** Problem 6 ******************************
       //  Do problems 1-4 in the PlayingCard class first
       // 6) Verify your class works by running this program 
       PlayingCard card1 = new PlayingCard();
       card1.print();
        
       PlayingCard card2 = new PlayingCard('S', 13);
       card2.print();
        
       /***************** end problem 6 ********************/
       /************ Problem 7 ******************************
       // 7) Add code to create a PlayingCard object  
       //    representing the Jack of Diamonds and print 
       //    the object to the screen
       PlayingCard jackD = new PlayingCard('D',11);
       jackD.print();
       
       
       //***************** end problem 7 *******************/
       /************ Problem 8 ******************************
       // 8) Add code to compare the ranks of two PlayingCard objects
       //    and print the card that has the higher rank
       if (card1.getRank() < card2.getRank()){
           card2.print();
       }
       else{
           card1.print();
       }
       
       
       //***************** end problem 8 *******************/
       //************ Problem 9 ******************************
       // Write statements that read a complete set 
       //   of PlayingCard information from a keyboard Scanner into
        //   temporary local variables for suit and rank
        //   then create a new PlayingCard object with that info 
        
        // a) declare local variables to store PlayingCard info
        char suit;
        int rank;
        Scanner keyboard = new Scanner(System.in);
        //b) read the PlayingCard info from the keyboard into your local variables
        System.out.println("Enter the suit of a playing card");
        suit = keyboard.next().charAt(0);
        
        System.out.println("Enter the rank of a playing card");
        rank = keyboard.nextInt();
        //c) create a new PlayingCard object with the info you just read
        PlayingCard yourCard = new PlayingCard(suit,rank);
        //d) print the PlayingCard object you just created and verify
        yourCard.print();
       
       
       //***************** end problem 9 *******************/
       
    }
   
}
// console problem 6
// Ace of Clubs

// King of Spades


//console problem 7
//Jack of Diamonds


// console problem 8: comparing card1 and card2 from problem 6**
// Ace of Clubs (card1)

// King of Spades (card2)

// King of Spades

// console problem 9
// Enter the suit of a playing card
// S
// Enter the rank of a playing card
// 1
// Ace of Spades