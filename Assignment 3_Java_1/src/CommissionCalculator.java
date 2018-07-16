/*
 * CommissionCalculator.java
 */

/**
 * @author Alex Louden
 * Assignment 3
 * 4/25/2018
 */

//Imports
import java.util.Scanner;

public class CommissionCalculator {
    
    public static void main(String args[]) {
        
    	// Initialize a Scanner to read input from the command line
    	Scanner sc = new Scanner(System.in);
    	
    	//Use variables for factors, for easy change down the road
    	double[] items = {239.99,129.75,99.95,350.89};
    	double com = .09;
    	
    	//Starting salary is 200
    	double earnings = 200;
    	
    	//An input of -1 will not add an item, or trip the exit.
    	//This is only a safety, if a bug is introduced in the code below, to avoid incorrect payment.
    	int input = -1;

    	/* While loop actually prints update on the iteration after the one that received the update.
    	 * This is safe because if an item is added, another loop is guaranteed.  It cuts down on repeated code.
    	 */
    	while(input != 0) {
    		//Prompt the user with a menu of the four items and their values
    		System.out.println("Item\tValue");
    		//Use array, so prices can be updated in one place
    		System.out.printf("1\t$%.2f%n",items[0]);
    		System.out.printf("2\t$%.2f%n",items[1]);
    		System.out.printf("3\t$%.2f%n",items[2]);
    		System.out.printf("4\t$%.2f%n",items[3]);
    		System.out.printf("Current compensation: $%.2f%n", earnings);
    		System.out.print("Please select an item from the list above (or enter 0 to exit):");
    		
    		//Wait for input
    		input = sc.nextInt();
    		/* Put result on next line.  This is only necessary for test output to look clean, because it
    		 * does not add a newline after input, while regular use does.  With this new line, regular
    		 * just has more spacing, which I think I prefer anyway.
    		 */
    		System.out.printf("%n");
    		
    		//Report error for invalid input
    		if(input > 4 || input < 0) {
    			System.out.println("ERROR: Invalid input!");
    		}
    		
    		/* Print Total earnings if exiting program
    		 * This case is handled before earnings addition.  Thus, even if a bug is introduced,
    		 * Payment accuracy may still be maintained.
    		 */
    		else if(input == 0) {
    			System.out.printf("Total earnings: $%.2f%n",earnings);
    		}
    		
    		//Add commission to earnings.
    		else {
    			earnings += items[input-1] * com;
    		}
    	//With some changed logic, total earnings print line could also be here.  I just like it this way.	
    	//End loop
    	}
    	
    	//Close Scanner
    	sc.close();
    }
    
}
