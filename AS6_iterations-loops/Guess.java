import java.util.Scanner;

/**
 * Joey Koumjian *
 * 6/23/22
 * Guess.java
 */
public class Guess
{
    public static void main(){
        int guess;
        int secret = (int)Math.round(100*Math.random());
        int count = 1;
        System.out.println(secret);
        System.out.println("Make a guess");
        do {
            Scanner keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            if (guess < secret){
                System.out.println("Higher!");
            }
            else if (guess > secret) {
                System.out.println("Lower!");
            }
            else {
                System.out.println("You got it!");
                System.out.println("It took you "+count+ " tries.");
            }
            count++;
        } while (guess != secret);
    }
}
