import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class ScrabbleGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrabbleGame 
{
    public static void main(String [] args) 
        throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f");
        Tile [] letterBag = new Tile[99];

//a) finish the fillBag method below main. This method fills the letterBag
//   with info for 99 tiles read from tiles.txt              
//        fillBag(letterBag);
        System.out.println("The first letter in letterBag is " + letterBag[0]);
        System.out.println("The last letter in letterBag is " + letterBag[98]);

//b) finish the makeRack method below main. This method creates a rack of 
//   7 tiles and assigns them 7 random tiles from letterBag
        Tile [] player1rack = makeRack(letterBag);
        Tile [] player2rack = makeRack(letterBag);
        
//c) add the printAllTiles method below main
        System.out.print("player 1 rack = "); 
//        printAllTiles(player1rack);
        System.out.print("player 2 rack = ");
//        printAllTiles(player2rack);
        
        System.out.println("Player 1, please enter a word from the letters in  your rack");
        String word1 = keyboard.next();

//d) CHALLENGE finish the validWord method below main. This determines if
//   the letters in word1 are all found (at the same or greater count) as 
//   the letters in player1rack. You can go on and come back to this later.
        if (validWord(word1, player1rack))   
        {
//e) EASIER CHALLENGE finish the scoreWord and scoreOfLetter methods below main
//   the scoreWord method steps through each letter in word, finds the corresponding
//   Tile in the rack, and adds up all the values associated with all the  Tiles 
//   that make up word
            int score1 = scoreWord(word1, player1rack);
            System.out.println("the word you chose has a score of " + score1);
//f) CHALLENGE figure out a way to replace the letters used by word in the rack
//    with new random letters taken from the letterBag
//            replenishRack(word1, player1rack, letterBag);
//            System.out.print("the new player 1 rack = ");
//            printAllTiles(player1rack); 
        }
        else    
            System.out.println("the word you chose doesn't work with your rack");        
    }
    
    public static void fillBag(Tile [] tiles)
            throws FileNotFoundException
    {  
        // this method is almost identical to the makeDeck method in BlackJackGame

    }
    
    public static Tile [] makeRack(Tile [] tileBag)
            throws FileNotFoundException
    {
        // create a Tile array called rack that can hold 7 tiles
        
        // make a for loop that starts with int k=0 and repeats 7 times
        
            // use the randomInt method to make a  
            //  random index from 0 - 99 (exclusive)
    
            // store the tile at that random index in tileBag
            // in position k of the rack
           
        // after the for loop, return your filled rack of tiles;     
        
        
        return null; // delete after completing the above
    }    

    public static int randomInt(int low, int high) {
        // Determine the length of the range.
                int range = high - low;
      
        // Give a random number from the range.
            return (int)(range*Math.random()) + low;
        
    }    
    public static void printAllTiles(Tile [] tiles)
    {
        for (int k = 0; k < tiles.length; k++)
          System.out.print(tiles[k] + " "); 
        System.out.println();// go to new line
    }    
    
    public static boolean validWord(String word, Tile [] rack)
    {
        // first make a countLetters method below this method
        // that takes a char and a String and returns the number 
        // of times the char value appears in the String. 
        //   See exercise 20 in assessment 8 for a solution to countLetters. 
        
        // then, make a String, rackString, which has all the letters 
        //   in the rack
        
        // then, make a for loop that goes through all the letters in 
        //   String word
        
        // if ever you find a letter in word that has a count higher
        //  than the same letter in rackString, return false
        
        // after your for loop finishes, return true--you got through
        // the loop withouth leaving, so there must be enough letters
        // in rack to allow you to choose word
        
        return true;   // remove after completing above
    }   
    

    public static int scoreWord(String word, Tile [] rack)
    {
        int score = 0;
        // a for loop that steps k to access every letter of word
        for (int k = 0; k < word.length(); k++)        
            // add to score the scoreOfLetter of word.charAt(k) in the rack
            score += 0;  // fix this so it does the above
        return score;
    }       
    
    public static int scoreOfLetter(char letter, Tile [] rack)
    {
        // write a for loop that steps k to access every Tile of rack

           // if the letter matches the letter in the Tile at location k in the rack

                // return the value of the Tile in the rack at location k
                
        return -1000; // after the loop, if we didn't find the letter, 
                      // something is wrong -- invalid word, so return -1000
    }
}
