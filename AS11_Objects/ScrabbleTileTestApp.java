import java.util.Scanner;
/**
 * Write a description of class ScrabbleTileTestApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ScrabbleTileTestApp
{
    public static void main(String [] args){
       /*********** Problem 6 ******************************
       //  Do problems 1-4 in the Tile class first
       // 6) Verify your class works by running this program 
       Tile tile1 = new Tile();       
       tile1.print();
        
       Tile tile2 = new Tile('J', 8);
       tile2.print();        
        
       //***************** end problem 6 ********************/
       /************ Problem 7 ******************************
       // 7) Add code to create a Tile object with 
       //    the letter 'Z' and value 10 and print the object 
       //    to the screen
       Tile tileEx = new Tile('Z',10);
       tileEx.print();
       
       //***************** end problem 7 *******************/
       /************ Problem 8 ******************************
       // 8) Add code to compare the values of two Tile objects
       //    and print the object that has the higher value
       if (tile1.getValue() < tile2.getValue()){
           tile2.print();
       }
       else{
           tile1.print();
       }
       
       
       //***************** end problem 8 *******************/
       //************ Problem 9 ******************************
       // Write statements that read a complete set 
       //   of Tile information from a keyboard Scanner into
        //   temporary local variables for letter and value
        //   then create a new Tile object with that info 
        
        // a) declare local variables to store Tile info
        char letter;
        int value;
        System.out.println("Enter the letter of a Scrabble Tile");
        Scanner keyboard = new Scanner(System.in);
        letter = keyboard.next().charAt(0);
        System.out.println("Enter the value of a Scrabble tile");
        value = keyboard.nextInt();
        // b) read the Tile info from the keyboard into your local variables
        // c) create a new Tile object with the info you just read
        Tile newTile = new Tile(letter,value);
        // d) print the Tile object you just created and verify
        newTile.print();
       
       
       //***************** end problem 9 *******************/
       
    }   
   
}
//console demo 6
// Letter = A
// Value = 1
//
// Letter = J
// Value = 8

//console demo 7
// Letter = Z
// Value = 10

//console demo 8
// Letter = J
// Value = 8

//console demo 9
// Enter the letter of a Scrabble Tile
// a
// Enter the value of a Scrabble tile
// 12
// Letter = a
// Value = 12
