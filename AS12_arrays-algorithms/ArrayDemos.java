/*
 * Joey Koumjian
 * 7/16/22
 * ArrayDemos.java
 */

import java.util.Scanner;

public class ArrayDemos
{
    public static void main(String[] args)
    {   System.out.print("\f");
        //* ----------------- Problem 1 ----------------------
        System.out.println("\nP1");
        // a) Declare an array of int called count, that holds 5 int values 
        //int[] count;
        //count = new int[5];
        
        //int[] count = new int[5];
        
        // b) Now assign the values 1, 5, 2, 9 and 8 to the five elements of your array using index [0] through [4]:
        int[] count = {1,5,2,9,8};
        // c) Print count array using the while loop illustrated at the bottom of section 12.1 of the text. 
        
        int q = 0;
        while (q < count.length){
            System.out.println(count[q]);
            q++;
        }
        System.out.println("");
        // d) Change the values using some of the techniques illustrated at the top in section 12.1.
        count[0] = 20;
        count[1]++;
        count[2]--;
        // e) Print the count array a second time to observe the changes made. 
        for (int i = 0 ; i < count.length ; i++){
            System.out.println(count[i]);
        }
        
         
        // -----------------------------------*/
        //* ----------------- Problem 2 ----------------------
        System.out.println("\nP2");
        // a) Make a copy of your count array called "copy" using the approach shown at top of sec12.2
        int[] copy = count;
        
        // b) change the value of copy[0], then print the count array a third time and observe the changes
        copy[0] = 45;
        for (int i = 0 ; i < copy.length ; i++){
            System.out.println(copy[i]);
        }
        System.out.println("");
        // c) Make your copy array truly be an independent copy using the approach shown at bottom of sec12.2
        int j = 0;
        while (j < 5){
            count[j] = copy[j];
            j++;
        }
        
        // d) repeat step b) and verify nothing irregular happens
        copy[0] = 50;
        for (int i = 0 ; i < copy.length ; i++){
            System.out.println(copy[i]);
        }
        
        // -----------------------------------*/        
        //* ----------------- Problem 3 ----------------------
        System.out.println("\nP3");        
        // Print the count array using a for-loop as illustrated in section 12.4 and 12.5
        for (int i = 0 ; i < copy.length ; i++) {
            System.out.println(copy[i]);
        }

        
        
        
        // -----------------------------------*/  
        //* ----------------- Problem 4 ----------------------
        System.out.println("\nP4");        
        // Generate an array "die100" with 100 throws of a die (from 1 to 6). You may 
        // wish to refer to slides 30-31 of the lecture 12 powerpoints for hints on 
        // how to generate the random numbers.
        
    // 0) create an int array called die100 with a size of 100 items
        int[] die100;
        die100 = new int[100];
    
    // 1) Type in code on slide 32, then modify to try the different 
        // formulas at left of slide. Finish with the bottom one, which
        // should simulate the roll of single die (1-6)
        for (int i = 0 ; i < 10 ; i++){
            double x = Math.random();
            //System.out.println((int)(x*6)+1);
        }
        
        // 2) once 1) works, Modiy the loop to assign the value being printed
        // to index i in the die100 array (make the loop go up to 100)
        for (int i = 0 ; i < die100.length ; i++){
            double x = Math.random();
            x = (int)(x*6)+1;
            die100[i] = (int)x;
        }
        
        // also, define a printArray method below main to print your int array. See slide 35.
        System.out.println("die100 contains the values: ");
        printArray(die100);       
        
        // -----------------------------------*/
        //* ----------------- Problem 5 ----------------------
        System.out.println("\nP5");
        // Define a method count5(int [] arr) below main that returns the count of the number of 
        // times a 5 is found in the array.
        
        System.out.println("The number 5 appeared " + count5(die100) + " in the die100 array");
        
     
        
        // -----------------------------------*/ 
        //* ----------------- Problem 6 ----------------------
        System.out.println("\nP6");
        // Define an int array counts that has 7 elements in it. 
        int[] counts = new int[7];
        // Follow the insructions in section 12.10 to create a histogram of the values in die100 stored
        // in the array counts. Then print your counts array from 1 to 6 and check if it represents the
        // true count of values in die100 (at least you can check if the count of 5's is the same as 
        // is count5 produces - there should be around 16 5's more or less). 
            for (int i = 0; i < die100.length; i++) {
            int index = die100[i];
            counts[index]++;
        }
        
        
        System.out.println("The histogram of die100 is ");
         printArray(counts);   // in viewing the results, are the numbers evenly distributed?
        
        
        // EXTRA CREDIT: display your results as a bar chart like the one shown in slide 42 (and 43)
        
    
        // -----------------------------------*/     
        /* ----------------- Problem 7 ----------------------
        System.out.println("\nP7");
        // Generate an array called "arr10" with 10 random values between 0 and 99
        
        System.out.println("arr10 contains the values: ");
        printArray(arr10);
        
        // Define a method maxValue that returns the largest number in an array 
        System.out.println("the largest value in arr10 is " + maxValue(arr10);
        
                
        // -----------------------------------*/
        /* ----------------- Problem 8 EXTRA CREDIT ----------------------
        System.out.println("\nP8");
        // Develop a bubbleSort method following the example slides 44-63 and use it 
        // to sort your arr10 array from problem 6
        
        bubbleSort(arr10);
        System.out.println("after sorting arr10, we have: ");
        printArray(arr10);
        
        
        // -----------------------------------*/       
    }   // end of main
    public static void printArray(int[] array){
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
    
    public static int count5(int[] array){
        int count = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] == 5){
                count++;
            }
        }
        return count;
    }
}    

// console P1
//
// P1
// 1
// 5
// 2
// 9
// 8
//
// 20
// 6
// 1
// 9
// 8
    
// console P2
//
// P2
// 45
// 6
// 1
// 9
// 8

// 50
// 6
// 1
// 9
// 8


// console P3
// P3
// 50
// 6
// 1
// 9
// 8

// console P4
// P4
// die100 contains the values: 
// 5
// 4
// 3
// 4
// 4
// 4
// 5
// 6
// 6
// 1
// 1
// 5
// 3
// 5
// 6
// 3
// 6
// 3
// 3
// 6
// 2
// 2
// 1
// 5
// 2
// 1
// 3
// 1
// 5
// 2
// 3
// 1
// 1
// 1
// 4
// 4
// 4
// 3
// 2
// 4
// 5
// 6
// 3
// 1
// 5
// 5
// 3
// 5
// 1
// 4
// 2
// 5
// 5
// 5
// 2
// 1
// 2
// 6
// 2
// 6
// 5
// 5
// 6
// 3
// 3
// 5
// 4
// 6
// 2
// 6
// 2
// 6
// 5
// 1
// 3
// 1
// 1
// 1
// 1
// 3
// 2
// 1
// 5
// 2
// 3
// 5
// 3
// 6
// 5
// 4
// 4
// 5
// 5
// 4
// 5
// 6
// 2
// 4
// 1
// 2

// console problem 5
// P5
// The number 5 appeared 23 in the die100 array

// console problem 6
// P6
// The histogram of die100 is 
// 0
// 18
// 15
// 16
// 14
// 23
// 14
