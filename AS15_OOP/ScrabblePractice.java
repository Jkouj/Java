// Import necessary classes.
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;                    

/**
 * Write a description of class ScrabblePractice here.
 * 

 */
public class ScrabblePractice 
{
    public static void main(String [] args)  
                        throws FileNotFoundException {
     // Set things up.   
            Scanner keyboard = new Scanner(System.in);  // Create a keyboard scanner.
            System.out.println("\f");   // Clear the screen.   
   
            ArrayList<Tile> player1rack = new ArrayList<Tile>();

     //****** Prob 1 -- add 5 tiles to player1rack:  A/1, A/1, B/3, T/1, X/8 
     
     
     System.out.print("player1rack = ");
     printAllTiles(player1rack); 
     //******************************* end Prob 1 ***/
     //****** Prob 2a -- determine if the letter A is in player1rack
     //                  write a for loop and print "found an A" whenever
     //                    you find a Tile that has an A in it
     
     
     //       Prob 2b-- compute and print the sum of all the values
     //                 of the Tiles in player1rack
     //                    use a for loop to add to sum the value of each Tile
     int sum = 0;
     
     
     
     //******************************* end Prob 2 ***/
     //****** Prob 3 -- make a String out of all the Tiles in player1rack
     String rack1Letters = "";
     
     // make a for loop, get each Tile from player1rack, 
     //                  get the Letter from the Tile (you can chain these with .'s)
     //                  and add it to the end of rack1Letters
     
     
     //******************************* end Prob 3 ***/
     //****** Prob 4 --  print the count of the number of A's in "ABRAXAS"
     //                  use the countLetters method defined below main 
     //                  then determine if the number of A's in rack1Letters is 
     //                  larger than the number of A's in "ABRAXAS"
     //     
     String word1 = "ABRAXAS";
     System.out.println("The number of A's in word1 = " );  // finish this
     
     
     //******************************* end Prob 4 ***/
     //****** Prob 5 -- make a for loop to traverse across all the letters in word1
     //                     store each letter in a char letter variable
     //                     if the count of this letter in word1 is larger 
     //                        than the count of this letter in rack1Letters
     //                          print ("not enough of letter " + letter)
      
     //******************************* end Prob 5 ***/
     //****** Prob 6 -- use the above ideas to finish the validWord method below main
     //                     
     
     System.out.println("Player 1, please enter a word from the letters in  your rack");
     word1 = keyboard.next();
     
     if (validWord(word1, player1rack)) {
         System.out.println("Your word is a valid word");
     }
     else {   
         System.out.println("The word you chose doesn't work with your rack.");   
     }    

     //******************************* end Prob 6 ***/
     //****** Prob 7 -- finish and test the scoreOfLetter method below main
     //                     
     System.out.println("The score of letter A is " + scoreOfLetter('A',player1rack));
     System.out.println("The score of letter X is " + scoreOfLetter('X',player1rack));

     //******************************* end Prob 7 ***/
     //****** Prob 8 -- finish and test the scoreWord method below main
     //                     
     System.out.println("The score of BAT is " + scoreWord("BAT",player1rack));
     System.out.println("The score of TAX is " + scoreWord("TAX",player1rack));
     
     
     //******************************* end Prob 8 ***/
     //****** Prob 9 -- Write a method to read in the scrabbleWords file 
     //                 into dictionary ArrayList 
     //                 similar to fillBag in ScrabbleGame but simpler
     
     ArrayList<String> dictionary = new ArrayList<String>();
     // readDictionary(dictionary);
     
     //******************************* end Prob 9 ***/
     //****** Prob 10 -- write a method that returns true if a word is found in the dictionary 
     //             
     
     // System.out.println("Is TAX a legal word in Scrabble? " + isLegal("TAX",dictionary));
     // System.out.println("Is ABRAXAS a legal word in Scrabble? " + isLegal("ABRAXAS",dictionary));
     //******************************* end Prob 10 ***/
     // CONGRATULATIONS! You now have the tools to go out and write a scrabble game!
    }   // END OF MAIN METHOD

    public static int countLetters(String s, char c)
    {
        int index = 0, count = 0;
        while (index < s.length()) {
          if (s.charAt(index) == c) {
            count++;
          }
          index++;
        }
        return count;
    }   
    // Prints all the tiles in an array.
    public static void printAllTiles(ArrayList<Tile> tiles) {        
            for (int k = 0; k < tiles.size(); k++) {
                System.out.print(tiles.get(k) + " "); 
            }        
            System.out.println();// Go to new line.                
    }   
    
    // This method has not been completed which means the user can cheat by entering 
    //  invalid words.
    public static boolean validWord(String word, ArrayList<Tile> rack)
    {
        // First make a countLetters method below this method
        // that takes a char and a String and returns the number 
        // of times the char value appears in the String. 
        // See exercise 20 in assessment 8 for a solution to countLetters.
        
        // Then, make a String, rackString, which has all the letters 
        // in the rack.
        
        // Then, make a for loop that goes through all the letters in 
        // String word.
        
        // If ever you find a letter in word that has a count higher
        // than the same letter in rackString, return false.
        
        // After your for loop finishes, return true--you got through
        // the loop withouth leaving, so there must be enough letters
        // in rack to allow you to choose word.        
                return true;   // Remove after completing above.                
    }      
    
    // Gives back the score of the letter on an individual tile in the rack.
    public static int scoreOfLetter(char letter, ArrayList<Tile> rack) {       
        // Write a for loop that steps k to access every Tile of rack.
        // If the letter matches the letter in the Tile at location k in the rack
        // return the value of the Tile in the rack at location k.

        
        return -1000; // return -1000 if the letter is not found, signals an error
    } 
    
    // Determines the score of a word and utilizes the "scoreOfLetter" method 
    //  in doing so.
    public static int scoreWord(String word, ArrayList<Tile> rack)
    {
        // Keep track of the score with this variable.
           int score = 0;
                
        // Write a "for" loop that steps k to access every letter of word.
            // Add to score the scoreOfLetter of word.charAt(k) in the rack
    
        return score;                
    }     
}