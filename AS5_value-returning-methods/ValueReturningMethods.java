/** 
 * Demonstration of Value returning methods
 */

public class ValueReturningMethods
{
   public static void main (String [] args)
   {       
      //******************  Demo 1 Void vs Value Returning Method Calls *****************************
      double radius = 4.5, angle = Math.PI/3;
      
      // calls to void methods must be on a line by themselves
       countdown(3);
       nLines(4);
       
      // calls to value returning methods must process the return value
       double e = Math.exp(1.0);
       double height = radius * Math.sin(angle);
       System.out.println("Here's a random #: " + Math.random());

      System.out.println();      // to leave a blank line 
      
      //****************** End Demo 1 ***************************/      
      /******************  Demo 2 Call sum, area and absoluteValue *****************************
      // first, write the sum method where indicated below
      //  then call sum, area and absoluteValue and print results
       
      
      
      
      //****************** End Demo 2 ***************************/  
      /******************  Demo 3 Boolean variables and Flags *****************************
      // print the boolean variables
      
      boolean flag;
      flag = true;
	  boolean testResult = false;
      
	  // write an if statement using the evenFlag as a condition
      boolean evenFlag = (n%2 == 0);     // true if n is even
      boolean positiveFlag = (x > 0);    // true if x is pos

      
      //****************** End Demo 3 *****************************/
      /******************  Demo 4 Logical Operators *****************************
      // change && to ||
      //   change snowing to !snowing
      
        double temp = 30;
        boolean snowing = false;
        
        if (temp < 32 && snowing){
        	System.out.println("wearParka");
        }
        else if (temp < 32){
        	System.out.println("wearJacket");
        }
        else{
        	System.out.println("wearShorts");
        }

      
      //****************** End Demo 4 ***************************/      
      /******************  Demo 5 Use the Boolean Method isValid *****************************

   
   
      //****************** End Demo 5 ***************************/      
 
   }  // END OF MAIN METHOD
   
   // define sum here
   
   
    
    public static double area(double radius)
    {
       double area;
       area = Math.PI * radius * radius;
       return area;
    }
    
     public static double absoluteValue(double x) {
        if (x < 0) {
          return -x;
        } else {
          return x;
        }
      }    

    public static boolean isValid(int number)
    {
       boolean status;
       if(number >= 1 && number <= 100)
          status = true;
       else
          status = false;
       return status;
    }
      
  public static void nLines(int n) {
    if (n > 0) {
      System.out.println("");
      nLines(n-1);
    }
  }

  public static void countdown(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
    } else {
      System.out.println(n);
      countdown(n-1);
    }
  }  

}