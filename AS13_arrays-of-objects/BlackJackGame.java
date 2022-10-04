import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class ScrabbleGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackJackGame 
{    
    public static void main(String [] args) 
        throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f");
        String answer;
        Card [] deck = new Card[52];

        //a) finish the makeDeck method below. This method fills the deck array
        //   with info for 52 cards read from cards.txt       
        makeDeck(deck);
        
        

        System.out.println("The first card in deck is " + deck[0]);
        System.out.println("The last card in deck is " + deck[51]);
    
        Card [] playerHand = new Card[10]; // player can have up to 10 cards
        Card [] computerHand = new Card[10];
        

        
        int playerCount = 0, computerCount = 0;
        int playerScore=0, computerScore=0;         

        System.out.print("Player hand = ");            
        //b) add the printCards method below main. It only prints playerCount cards in the array
    
        
        //c) add the blackJackValue method below main, then test with the following
        //   two lines of code. The blackJack value is the rank for ranks 1-10, 
        //   and 10 for all others
        //Card test = new Card('S',12);
        //System.out.println("The blackjack value of test card = " + blackJackValue(test));
                
        //d) finish the score method below main. It adds up and returns
        //   the blackJackValue of the first count cards in the array passed to it
        //   initially the score will be zero.
        System.out.println("Player score = " + score(playerHand, playerCount));        

        System.out.print("Player, hit or stay? ");  
        answer = keyboard.next();
        
        while (answer.equals("hit")) {           
            System.out.println("Dealing ... ");
            //e) finish the deal method below main. It picks a random index from 0 to 51
            //    and returns the card in the deck array at that index               
            playerHand[playerCount] = deal(deck);
            playerCount++;
            
            System.out.print("player hand = ");
            printCards(playerHand, playerCount);
            
            playerScore = score(playerHand, playerCount);
            System.out.println("Player score = " + playerScore);
            
            System.out.print("Player, hit or stay? ");  
            answer = keyboard.next();            
        }   
            
        System.out.print("Computer: ");  
  
         //f) finish the while loop for the computer's turn
 
        while (computerScore < 16) { // the computer automatically stays at 16          
            System.out.println("Dealing ... ");
            // deal a card to the computerHand array
            computerHand[computerCount] = deal(deck);
            // increase computerCount
            computerCount++;
            // print the computer hand
            System.out.print("computer hand = ");
            printCards(computerHand,computerCount);
            // compute the computerScore 
            computerScore = score(computerHand, computerCount);
            System.out.println("computer score = " + computerScore);
            // print the computerScore
            System.out.println(computerScore);
        }    
        
        // g)  determine and print the outcome of the game
        if (computerScore > 21){
            System.out.println("Computer busted");
        }
        else if (computerScore == playerScore){
            System.out.println("Tie");
        }
        else if (computerScore > playerScore){
            System.out.println("Computer wins");
        }
        else {
            System.out.println("Player Wins");
        }
                    
    } // END OF MAIN METHOD
    
    public static void makeDeck(Card [] deck)
            throws FileNotFoundException
    {
        // make a Scanner inputFile and connect to file cards.txt
        Scanner inputFile = new Scanner(new File("cards.txt"));

        int k = 0;
        // while loop, as long as k<52 AND there is more info in file
        while (k<52) {
                // read a char from the file, store in suit
                char tempSuit = inputFile.next().charAt(0);
                // read an int from the file, store in rank
                int tempRank = inputFile.nextInt();
                // make a Card temp a new Card with the suit and rank you read
                Card tempCard = new Card(tempSuit, tempRank);
                // assign temp to the next location in the deck array
                deck[k] = tempCard;
                // add 1 to k for next time around
                k++;
        }
    }
    
    public static Card deal(Card [] deck)
    {
        // use the randomInt method to generate 
        // a random integer between 0 (inclusive) to 52 (exclusive)
        return deck[randomInt(0,52)];
        // return the card in deck at your randomIndex
        
    }    

    public static int randomInt(int low, int high) {
        // returns a random int from low (inclusive) to high (exclusive)
        // Determine the length of the range.
                int range = high - low;
      
        // Give a random number from the range.
            return (int)(range*Math.random()) + low;
        
    }    
   

    public static int score(Card [] hand, int count)
    {
        int score = 0;
        for (int i = 0 ; i < count ; i++){
            score = score + blackJackValue(hand[i]);
        }
        return score;
    }       
    
    public static int blackJackValue(Card c)
    {
        if (c.getRank() <= 10)  {
        // if the rank of Card c is less than or equal to 10
        // just return the rank
        return c.getRank();
        }
        // otherwise, return 10  
        else{
            return 10;
        }
    }
    
    public static void printCards(Card [] playerHand, int playerCount){
        for (int i = 0 ; i < playerCount ; i++){
            System.out.println(playerHand[i].getSuit() +" "+playerHand[i].getRank());
        }
    }
}
