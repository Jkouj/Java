
/**
 * WordOfFortune.java
 * Joey Koumjian
 * 6/27/22
 */
import java.util.Scanner;
public class WordOfFortune
{
    // instance variables - replace the example below with your own
    private int x;

    
    /**
     * Constructor for objects of class WordOfFortune
     */
    public static void WordOfFortune()
    {
        String secret;
        int length;
        do{
            System.out.println("Player 1: Enter a secret word with 3-10 letters");
            Scanner keyboard = new Scanner(System.in);
            secret = keyboard.nextLine();
            length = secret.length();
        }while((secret.length()>10) || (secret.length() < 3));
        System.out.println("\f");
        //System.out.println(secret);
        //System.out.println("It has "+secret.length()+" letters.");
        //System.out.println("The first letter is: "+secret.charAt(0));
        //end of p1
        
        String guess;
        int count = 0;
        do {
            System.out.println("Player 2, enter a guess, it should have "+secret.length()+" letters");
            Scanner keyboard = new Scanner(System.in);
            guess = keyboard.nextLine();
            if (guess.length() != secret.length()){
                System.out.println("Wrong number of letters");
            }
            if (count == 2 && (guess.charAt(0) != secret.charAt(0))){
                System.out.println("The first letter is: "+secret.charAt(0));
            }
            if (guess.length() == secret.length()){
                printCorrectLetters(secret, guess);
            }
            count++;
        } while (!guess.equals(secret));
        System.out.println();
        System.out.println("You got it in "+count+" guesses");
    }

    public static void printCorrectLetters(String wordA, String wordB)
    {
        int i = 0;
        char letterA, letterB;
        while (i < wordA.length()){
            letterA = wordA.charAt(i);
            letterB = wordB.charAt(i);
            if (letterA == letterB){
                System.out.print(wordA.charAt(i));
            }
            else {
                System.out.print("-");
            }
            i++;
        }
    }
}
