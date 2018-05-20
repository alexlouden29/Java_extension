/*
 * RockNRollah.java
 */

import java.util.Random;

/**
 *
 * @author StudentName
 */
public class RockNRollah {
       
    public static void main(String[] args) {
    	// Initialize variables
    	int NUM_ROLLS = 36_000_000;
    	Random rand = new Random();
    	int d1 = 0;
    	int d2 = 0;
    	int[] rolls = new int[13]; //rolls[0] and rolls[1] are not used
    	
    	// Roll dice NUM_ROLLS times
    	for(int x = 0; x < NUM_ROLLS; x++) {
    		//Each dice evaluates to a number 1-6
    		d1 = rand.nextInt(6)+1;
    		d2 = rand.nextInt(6)+1;
    		//Increment the array at the index that equals the rolled number for clarity
    		rolls[d1+d2]++;
    	}
    	
    	// Roll the dice (a lot) and sum and tally the results
        // Display the frequencies
        System.out.println("Results after " + NUM_ROLLS + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");
        
        //Loop through possible results and display tallys
        // Loop begins at 2, the first possible rolled number
        for(int x = 2; x < rolls.length; x++) {
        	System.out.printf("%d\t%d\n", x, rolls[x]);
        }
    }
    
}
