/*
 * SmallestInt.java
 */

/**
 * @author Alexander Louden
 * Assignment 4
 * 04/29/2018
 */


//Even if my code is correct, if something I do is not best practice, or there is an even cleaner/better way to do it, please let me know.
//I already know java at this level so I'm interested in getting my best practice fundamentals down.
import java.util.Scanner;

public class SmallestInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Initialize variables
        Scanner sc = new Scanner(System.in);
    	int numInts = 0;
    	int newNumber;
    	//This number will never be used (unless the user enters it) because it's always bigger
    	//Maybe a little dramatic, but I felt this made the below section cleanest
    	int smallest = Integer.MAX_VALUE;
    	
    	//Prompt user for number of numbers to check.  Prompt until input until valid input is given
        while (true) {
        	
        	System.out.print("How many integers shall we compare? (Enter a positive integer): ");
        	numInts = sc.nextInt();
        		
        	//If valid input, break out of loop
        	if (numInts > 0) {
        		break;
        	}
        	//Report Invalid input, repeat loop until if condition satisfied
        	System.out.println("Invalid input!");
        	
        }//End #inputs prompt

        //Read inputs from user and determine smallest
        for(int i = 0; i < numInts; i++ ) {
        	
        		// Prompt user
            	System.out.print("Enter value " + (i+1) + ": ");
            	
            	//Read user input
            	newNumber = sc.nextInt();
            	
            	//Check against current smallest, assign to smallest if needed
            	if (newNumber < smallest) {
            		smallest = newNumber;
            	}
        }
        
        //Display smallest number to user
        System.out.println("The smallest number entered was: " + smallest);
        sc.close();
    }
    
}
