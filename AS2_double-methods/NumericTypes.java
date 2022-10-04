/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes
{


   public static void main (String [] args)
   {
       
      //******************  Problem 1 *****************************
      //variable declarations
      double number = 2 ;     // number of scores
      double score1 = 100;    // first test score
      double score2 = 95;     // second test score
      double average;            // arithmetic average
      String output;             // line of output to print out
      
      // Find the average of score1 and score2
      average = (score1 + score2) / number;
      
      // Print the average with explanatory info
      System.out.println("The average of " + score1 + " and " + score2 + " is " + average);      
      System.out.println();      // to leave a blank line 
      
      //*/
      //*****************  Problem 2 *****************************
      
      double fahrenheit = 212;  // boiling temperature in fahrenheit
      double celsius;  // temperature in celsius
     
      // Convert Fahrenheit temperatures to Celsius
      celsius = ((double)5/(double)9) * (fahrenheit - 32);
      System.out.println(fahrenheit + " deg F = " + celsius + " deg C");
      System.out.println();      // to leave a blank line

      //*/
      //******************  Problem 3 *****************************
      
      double diameter = 12; // the diameter of a sphere
      // Create a variable to store the radius and initialize with 
      //    one half of the diameter 
      double radius = diameter * 0.5;
      // calculate and store the volume of the sphere using Math.PI and Math.pow
      double volume = ((double)4/(double)3)*(Math.PI)*(Math.pow(radius,3));
      // print out the volume
      System.out.println(volume);
      System.out.println();
      
      
      //*/
      /******************  Problem 4 *****************************
      // Compute the square root of the number stored in N
      double N = 3;
      System.out.println("We are going to find the square root of N, when N = " + N);

      double lastGuess = 1;                                                 // step 1
      System.out.println("Our first guess is " + lastGuess);
      
      double nextGuess = 0;  // fix this                                    // step 2         
      System.out.println("nextGuess =  and nextGuess^2 = "); //fix this     // step 3      
      lastGuess = nextGuess;                                                // step 4      
         
      // now repeat steps 2 - 4 five more times by copying and pasting them below:
     
      
      // now print the difference between lastGuess and the square root of 3 obtained using Math.sqrt
      System.out.println("The difference between lastGuess and the real square root of 3 is "); // fix this
      //*/      
   }  
}

/*
 * The average of 100.0 and 95.0 is 97.5

 * 212.0 deg F = 100.0 deg C

 * 904.7786842338603
 */