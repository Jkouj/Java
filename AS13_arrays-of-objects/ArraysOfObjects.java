import java.awt.Point;
/**
 * Joey Koumjian
 * ArraysOfObjects.java
 * 7/24/22
 */
public class ArraysOfObjects
{
    public static void main(String [] args)
    {
        System.out.println("\f");
        /*======= Problem 0 Before You Begin==========================
        //    Make sure you define and test the Employee Class   
        //    You may want to review the code in the Time class to help you
        //------- End Problem 0 ------------------------------------*/
        
        /*======= Problem 1 Review of Classes and Objects ============
        //a) Make a variable t, of type Time, set to 11:28:42 
        //Time t = new Time();
        //t.setHour(11);
        //t.setMinute(28);
        //t.setSecond(42.00);
        
        //works either way   ^ || v
        
        Time t = new Time(11,28,42.00);
        
        
        System.out.print("Here is what is in object t ");
        t.print();          
        
         
        //b) Make a variable emp, of type Employee, set to ("Jamal", 43434,56400.00) 
        //    and print it
        Employee emp = new Employee("Jamal", 43434,56400.00);
        emp.print();
        
        
        //------- End Problem 1 ------------------------------------*/
        
        /*======= Problem 2 Arrays of Time and String Objects ============
        //a) Make an array of 5 Time objects called meetingTimes,         
        Time [] meetingTimes = new Time[5];
        
        //b) assign the following times to cells [0] through [4] of meetingTimes:   
        //      8:30, 10:00, 12:30, 3:00 and 5:15
        meetingTimes[0] = new Time(8,30,0.00);
        meetingTimes[1] = new Time(10,00,0.00);
        meetingTimes[2] = new Time(12,30,0.00);
        meetingTimes[3] = new Time(3,00,0.00);
        meetingTimes[4] = new Time(5,15,0.00);
        
        //c) change the last meeting time to 6:15 by  
        //   selecting to index 4 of the meetingTimes array, 
        //   and using the setHour and setMinute methods to change the time      
        meetingTimes[4].setHour(6);
        meetingTimes[4].setMinute(15);
        
        //d) Declare an array of 5 String objects called locations and
        //    use an initialization list to store these Strings in the array
        //    i.e set the array = {"BMC205","BMC207","PS106","GA103","BMC202B"}; 
        String [] locations = {"BMC205","BMC207","PS106","GA103","BMC202B"};
        
        //e) Use a for loop to traverse both arrays with the same index
        //     and print the times and locations of the meetings
        //     so it says something like: 
        //          At 8:30 you have a meeting in BMC205
        //          At 10:00 you have a meeting in BMC207  and so on
        //
        //     Build the output using System.out.println, and for meetingTimes[k]
        //     use .getHour() and .getMinute() with a ":" between them
        for (int i = 0 ; i < locations.length ; i++){
            System.out.println("At " + meetingTimes[i].getHour() +":" + meetingTimes[i].getMinute() + " you have a meeting in "+locations[i]);
        }
        
        //------- End Problem 2 ------------------------------------*/
          
       //*======= Problem 3 Arrays of Employee Objects ============
        //a) Make an array of 6 Employee objects called startup
        //     and make all its elements refer to default Employee objects
        //      (use a for loop and assign each cell a new Employee())
       Employee [] startup = new Employee[5];
       for (int k = 0 ; k < startup.length ; k++){
           startup[k] = new Employee();
       }
                
       
        //b) Define the method printAllEmployees where indicated below main
        //     then activate the following 2 statements:
       
           System.out.println("Here are the employees at our new startup:");
           printAllEmployees(startup);
        
        //c) Set the first three elements to new Employees with fictitious
        //   names, IDs and salarys  (like John Pilsner, 1111,35000 ... etc)
        //   and print all the employees again
        startup[0] = new Employee("John Pilsner", 1111, 35000);
        startup[1] = new Employee("Jack Johnson", 1234, 89000);
        startup[2] = new Employee("Diane Robinson", 9876, 99000);
        //d) If a 5% raise can be given by setting an employees salary *= 1.05, 
        //    define the method giveRaiseToAll where indicated below main, 
        //     then activate the following statements:

           System.out.println("After giving a 5% raise to all workers:");
           giveRaiseToAll(startup,5);
           printAllEmployees(startup);
             

        //------- End Problem 3 ------------------------------------*/  
    }
    
    public static void printAllEmployees(Employee[] startup) {
        for (int i = 0 ; i < startup.length ; i++){
            System.out.println(startup[i].getName());
        }
    }
    
    public static void giveRaiseToAll(Employee[] startup, int value){
        value = 1 + value/100;
        for (int i = 0 ; i < startup.length ; i++){
            startup[i].setSalary(startup[i].getSalary()*value);
        }
    }
    
    
    // 3b) Define the static void method printAllEmployees here
    //      in this method, use a for loop to .print() all the items in array
    
    // 3c) Define the static void method giveRaiseToAll here
    //       it receives as parameters an array of Employees and a double rate
    //       in this method, define a double scale variable 
    //           and set scale equal to 1 + rate/100
    //       then use a for loop to access each employee
    //           and use the getSalary and setSalary methods to 
    //           change the salary to a new salary that is scale * old salary
    //           you can do this in one line using "composition"
    //           or in several lines using local variables to store 
    //             intermediate values

}


//console problem 1
//
// Here is what is in object t 11:28:42.0
// Jamal
 // ID Number: 43434
 // Salary: 56400.0
 
//console problem 2
//
// At 8:30 you have a meeting in BMC205
// At 10:0 you have a meeting in BMC207
// At 12:30 you have a meeting in PS106
// At 3:0 you have a meeting in GA103
// At 6:15 you have a meeting in BMC202B

//console problem 3
//
// Here are the employees at our new startup:
// james
// james
// james
// james
// james
// After giving a 5% raise to all workers:
// John Pilsner
// Jack Johnson
// Diane Robinson
// james
// james