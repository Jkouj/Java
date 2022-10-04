import java.util.Scanner;
/**
 * CodingBatApp: a class that uses CodingBat methods to assist with various tasks
 * 
 *    An example of the Structured Programming paradigm, which was the dominant
 *    way of programming from the 1960's to the 1980's (and is still in use today)
 *    
 *    This demo is developed in lecture, see the lecture video for more info 
 *   
 */
public class StructProgApplication
{
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f");
        //************* Demo 1 ***********************
        // We will use the sleepIn method in the CodingBat class 
        //   to tell us if we can sleep in tomorrow
        System.out.println("Is tomorrow a weekday? Please enter true or false");
        boolean weekday = keyboard.nextBoolean();
        System.out.println("Is tomorrow a holiday? Please enter true or false");
        boolean holiday = keyboard.nextBoolean();
        
        // notice, to invoke sleepIn, we have to precede it with the 
        if (CodingBat.sleepIn(weekday, holiday))
            System.out.println("You can sleep in tomorrow!");
        else
            System.out.println("Better set your alarm!");
               
        //************** End Demo 1 ******************/
        //************* Demo 2 ***********************
        // We will use the sumDigits method in the CodingBat class 
        
        System.out.println("Enter an integer and I will tell you the sum of its digits! ");
        
        // declare int num and read from the keyboard
        int num = keyboard.nextInt();
        // use the sumDigits method in CodingBat class to print the sum of the digits of num
        System.out.println(CodingBat.sumDigits(num));
       
        //************** End Demo 2 ******************/
        //************* Demo 3 ***********************
        // We will use the caughtSpeeding method in the CodingBat class 
        //   to tell us what kind of ticket we get
        
        System.out.println("Greetings, driver,");
        System.out.println("Do you know how fast you were going? (be honest!) ");
        int speed = keyboard.nextInt();
        System.out.println("Is today your birthday? Please enter true or false");
        boolean birthday = keyboard.nextBoolean();
        
        // use the caughtSpeeding method in the CodingBat class to print how big a ticket you get
        System.out.println(CodingBat.caughtSpeeding(speed,holiday));
        
        
        
        //************** End Demo 3 ******************/
   
    
    }
}

/*
 * 
Is tomorrow a weekday? Please enter true or false
true
Is tomorrow a holiday? Please enter true or false
true
You can sleep in tomorrow!
Enter an integer and I will tell you the sum of its digits! 
134
8
Greetings, driver,
Do you know how fast you were going? (be honest!) 
129
Is today your birthday? Please enter true or false
false
2
 *
 */