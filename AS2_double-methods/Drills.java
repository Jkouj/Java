/**
 * Write a description of class Drills here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drills
{
    public static void main (String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)
        
        //************* Ex A **************************
        // write a void method, paycheck, below main that calculates and prints
        //  a worker's paycheck, given the number of hours, and pay rate
        payCheck( 40, 7.75);
        
        payCheck( 20, 9.25);
        
        payCheck( 50, 12.50);
        
        //************ End Ex A **********************/
        //************* Ex B **************************
        // write a void method volume below main that calculates and prints
        //  the volume of a cylinder, given the radius and height
        
        volume( 0.5, 3);
        
        volume( 2, 2);
        
        // call area one more time to do the last test in the test plan 
        
        //************ End Ex B **********************/
        //************* Ex C **************************
        // write a void method feetAndInches below main that calculates 
        // and prints the number of feet and inches in a given number of 
        // inches
        
        feetAndInches(40);
        
        // call your method two more times to finish the test plan
        

        
        //************ End Ex C **********************/
        //************* Ex D **************************
        // write a void method averageSale below main that calculates 
        // and prints the the average sale of a comic book sold at
        // a convention
        
        averageSale(500,47);
        // call your method three times to verify the test plan
        

        
        //************ End Ex D **********************/
        
    }
    // Define method paycheck here
    public static void payCheck(double hours, double rate) {
            double pay = hours * rate;
            System.out.println("Hours: " +hours+ " Rate: "+rate+" Amount: $"+pay);
        }
    /*
     * Hours: 40.0 Rate: 7.75 Amount: $310.0
     * Hours: 20.0 Rate: 9.25 Amount: $185.0
     * Hours: 50.0 Rate: 12.5 Amount: $625.0
     */
    
    // Define method volume here
    public static void volume(double radius, double height) {
        double volume = (Math.PI)*(Math.pow(radius,2)) * height;
        System.out.println("Radius: "+radius+" Height: "+height+" Volume: "+volume);
    }
    /*
     * Radius: 0.5 Height: 3.0 Volume: 2.356194490192345
     * Radius: 2.0 Height: 2.0 Volume: 25.132741228718345
     */
    // Define method feetAndInches here
    public static void feetAndInches(float inches){
        double feet = inches/12;
        double leftover_inches = inches-feet*12;
        System.out.println("Inches: "+inches+ " Feet: "+feet+ " Leftover Inches: "+leftover_inches);
    }
    /*
     * Inches: 40.0 Feet: 3.3333332538604736 Leftover Inches: 9.5367431640625E-7
     */
    // Define method averageSale here
    public static void averageSale(double revenue, double sold){
        double average = revenue/sold;
        System.out.println("Total Revenue: "+revenue+" Number sold: "+sold+" Average sale: "+average);
    }
    /*
     * Total Revenue: 500.0 Number sold: 47.0 Average sale: 10.638297872340425
     */

    
}
