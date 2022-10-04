import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Joey Koumjian
 * ScrabbleGame.java
 * 7/29/22
 */
public class ScrabbleGame 
{
    //main function that runs the game
    public static void main(String [] args) 
        throws FileNotFoundException
    {
        //flushing screen
        //initializing and filling an ArrayList of Tile objects
        System.out.println("\f");
        ArrayList<Tile> tiles = new ArrayList<Tile>();        
        tiles = fillBag(tiles);
        //System.out.println("The first letter in letterBag is " + tiles.get(0));
        //System.out.println("The last letter in letterBag is " + tiles.get(96));
        
        //creating player 1 and 2 tile racks
        ArrayList<Tile> player1rack = makeRack(tiles);
        ArrayList<Tile> player2rack = makeRack(tiles);
        
        //printing player1rack out to the screen
        System.out.print("player 1 rack = "); 
        System.out.println();
        printAllTiles(player1rack);
        //System.out.println();
        
        //this is the first do while loop that asks player 1 for a word
        //and checks to make sure that it is valid
        String word1 = "";
        while (true){
            //scanner initialized
            //asks user for input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Player 1, please enter a word from the letters in  your rack");
            word1 = keyboard.next();
            
            //if the word is "valid" ---> print the new replenished rack
            //and print the score of the word the user inputs
            if (validWord(word1, player1rack))   
            {
                int score1 = scoreWord(word1, tiles);
                System.out.println("the word you chose has a score of " + score1);
                player1rack = replenishRack(word1, player1rack, tiles);
                System.out.print("the new player 1 rack = ");
                System.out.println();
                printAllTiles(player1rack); 
                System.out.println();
                break;
            }
            //otherwise print the word is not valid, and ask the user again
            //for a new word
            else {  
                System.out.println("the word you chose doesn't work with your rack");        
            }
        }
    
        //prints player2rack
        System.out.print("player 2 rack = ");
        System.out.println();
        printAllTiles(player2rack);
        System.out.println();
        
        //this is the second do while loop that asks player 2 to make a word
        //is the exact same as above, but for player 2
        String word2 = "";
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Player 2, please enter a word from the letters in  your rack");
            word2 = keyboard.next();
            
            if (validWord(word2, player2rack))   
            {
                int score2 = scoreWord(word2, tiles);
                System.out.println("the word you chose has a score of " + score2);
                player2rack = replenishRack(word2, player2rack, tiles);
                System.out.print("the new player 2 rack = ");
                System.out.println();
                printAllTiles(player2rack); 
                System.out.println();
                break;
            }
            else {  
                System.out.println("the word you chose doesn't work with your rack");        
            }
        } 
        System.out.println("Player 1 entered: "+word1+" score of: "+scoreWord(word1,tiles));
        System.out.println("Player 2 entered: "+word2+" score of: "+scoreWord(word2,tiles));

        //comparing the scores of the words given and determining the winner
        if (scoreWord(word1, tiles) == scoreWord(word2, tiles)) {
            System.out.println("Tie!");
        }
        else if (scoreWord(word1, tiles) > scoreWord(word2, tiles)){
            System.out.println("Player 1 wins!");
        }
        else {
            System.out.println("Player 2 wins!");
        }
    }
    
    
    //funciton to fill the tile bag with their respecitve letter and value
    public static ArrayList<Tile> fillBag(ArrayList<Tile> tiles)
            //makes sure the file is valid
            throws FileNotFoundException
    {  
        //initialize a scanner
        //read every line and assign the character to a char and the value to an int
        //initialize the char and value
        Scanner sc = new Scanner(new File("tiles.txt"));
        for (int i = 0 ; i < 97 ; i++){
            char letter = sc.next().charAt(0);
            int value = sc.nextInt();
            Tile tempTile = new Tile(letter,value);
            tiles.add(tempTile);
        }
        return tiles;
    }
    
    //function to make the playerRack
    public static ArrayList<Tile> makeRack(ArrayList<Tile> tiles)
            throws FileNotFoundException
    {
        //initialize a new arraylist of tiles and add 7 random tiles
        ArrayList<Tile> tileRack = new ArrayList<Tile>();
        for (int i = 0 ; i < 7 ; i++){
            int random = randomInt(0,tiles.size());
            Tile tempTile;
            tempTile = tiles.get(random);
            tileRack.add(tempTile);
            tiles.remove(random);        
        }
        return tileRack;
    }    

    //function to create a random integer from a given range
    public static int randomInt(int low, int high) {
        // Determine the length of the range.
                int range = high - low;
        // Give a random number from the range.
            return (int)(range*Math.random()) + low;
    }    
    
    //function to print all the tiles in a given rack
    public static void printAllTiles(ArrayList<Tile> tiles)
    {
        //loops through every tile in the rack and prints them on a new line
        for (int k = 0; k < tiles.size(); k++) {
            System.out.print(tiles.get(k) + " "); 
            System.out.println();// go to new line
        }
    }    

    //function to determine if the word is valid or not
    //checks if the user inputted a character more than allowed to based of their rack
    public static boolean validWord(String word, ArrayList<Tile> playerRack)
    { 
        //creates a string of all the letters in the rack
        String rackString = "";
        for (int i = 0; i < playerRack.size() ; i++){
            rackString += playerRack.get(i).getLetter();
        }
        //looping through the word to see if any character in the word
        //has a higher count than the letter in the rack
        // (checks if you have used too many of one letter or not)
        for (int i = 0; i < word.length() ; i++){
            if (countLetters(word.charAt(i),word) > countLetters(word.charAt(i),rackString)) {
                    return false;
            }
        }
        // if ever you find a letter in word that has a count higher
        //  than the same letter in rackString, return false
        
        // after your for loop finishes, return true--you got through
        // the loop withouth leaving, so there must be enough letters
        // in rack to allow you to choose word
        
        return true;   // remove after completing above
    }   
    
    //function to return the score of a given word
    //uses the function below to do so
    public static int scoreWord(String word, ArrayList<Tile> tiles)
    {
        //loops through every character in the word
        //gets the score of the character and adds it to the total score
        int score = 0;
        for (int k = 0; k < word.length(); k++) { 
            score += scoreOfLetter(word.charAt(k), tiles);
        }
        return score;
    }       
    
    //function to return the score of an individual character
    public static int scoreOfLetter(char letter, ArrayList<Tile> tiles)
    {
        // write a for loop that steps k to access every Tile of rack
        for (int k = 0; k < tiles.size() ; k++){
            // if the letter matches the letter in the Tile at location k in the rack
            if (tiles.get(k).getLetter() == letter){
                return tiles.get(k).getValue();
            }
            // return the value of the Tile in the rack at location k
            }        
        return -1000; // after the loop, if we didn't find the letter, 
                      // something is wrong -- invalid word, so return -1000
    }
    
    //function that is used in validWord()
    //counts how many times a character appears in a string
    public static int countLetters (char letter, String word){
        int count = 0;
        //loops through every character in the word
        //if the character is equal to the letter were looking for
        //then add to the score
        for (int i = 0 ; i < word.length() ; i++){
            if (word.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
    
    //when the user enters their word
    //this function removes the characters they used from the ArrayList
    //and replaces the missing slots with new randomized tiles
    public static ArrayList<Tile> replenishRack(String word, ArrayList<Tile> playerRack, ArrayList<Tile> tiles) {
        //nested for loop that checks each character k in the word
        //and compares it to every character i in the playerRack
        //by doing this it compares every character in the word
        //to every character in the rack - no matter the sizes
        for (int i = 0; i < playerRack.size() ; i++){
            for (int k = 0 ; k < word.length() ; k++) {
                if (word.charAt(k) == playerRack.get(i).getLetter()){
                    int random = randomInt(0,tiles.size());
                    playerRack.remove(i);
                    playerRack.add(tiles.get(random));
                }
            }
        }
        return playerRack;
    }
}
