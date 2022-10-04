
/**
 * Joey Koumjian
 * PartA.java
 * 6/21/22
 */
public class PartA
{
    public static void main(String [] args)
    {
        //************* Prob 1 ***********************
        // write the isDivisible method below main
        //  test by running this segment
        
        System.out.println("Is 8 divisible by 3? " + isDivisible(8,3));
        System.out.println("Is 9 divisible by 3? " + isDivisible(9,3));
        
        //************** End Prob 1 ******************/
        
        //************* Prob 2 ***********************
        // write the multadd method below main
        //  test by running this segment
        
        System.out.println("1*2 + 3 = " + multAdd(1.0, 2.0, 3.0));
        
        // write 2 more test cases
        
        System.out.println("4*5 + 6 = " + multAdd(4.0, 5.0, 6.0));
        System.out.println("7*8 + 9.9 = " + multAdd(7.0, 8.0, 9.9));
        
        
        //************** End Prob 2 ******************/
        
        //************* Prob 3 ***********************
        // write the isTriangle method below main
        //   HINT: use || or && to chain three logical expressions
        //         together
        //  then write some code that prints "it's a triangle"
        //    if the numbers 4, 1, 2 could be sides of a triangle
        //    or prints "not a triangle" if the numbers 4,1,2 cannot.
        //
        
        if ( isTriangle(4,1,2)){
            System.out.println("4,1,2 is a triangle");
        }
        else{
            System.out.println("4,1,2 is NOT a triangle");
        }
        
        if ( isTriangle(14,10,12)){
            System.out.println("14,10,12 is a triangle");
        }
        else{
            System.out.println("14,10,12 is NOT a triangle");
        }   
        
        // add another three test cases here
        
        
        //************** End Prob 3 ******************/
    } // end of main
    public static boolean isDivisible(int n, int m){
        if ((n%m)==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static double multAdd(double a,double b,double c) {
        return (a*b) + c;
    }
    public static boolean isTriangle(int a, int b, int c) {
        /*
         * “If any of the three lengths is greater than the sum of the other two, 
         *  then you cannot form a triangle. Otherwise, you can.” 
         */
        if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
            return false;
        }
        else {
            return true;
        }
    }
}
