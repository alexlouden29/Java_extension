/*
 * FindPrimes.java
 */

/**
 * @author Alexander Louden
 * Assignment 5
 * Exercise 6.25
 * 5/13/2018
 */
public class FindPrimes {
       
    public static void main(String[] args) {
        System.out.println("Prime numbers < 10k:");
        
        // Loop 10000 times checking for primes
        for(int x = 1; x <= 10000; x++) {
        	if(isPrime(x) == true) {
        		//Display number if it is prime
        		System.out.println(x);
        	}
        }
    }
    
    //Method to determine if the given int is prime.  Uses sqrt(n) as upper bound
    public static boolean isPrime(int num) {
    	
    	boolean isPrime = true;
    	
    	//Negative numbers, 0 and 1 are not prime
    	if(num <= 1) {
    		isPrime = false;
    	}
    	
    	//Loop up to sqrt(n) and check if modulus returns zero
    	else {
    		//Floor is used, because if square root is 11.2, there cannot be 2 factors that are both 12 or higher
    		int limit = (int)Math.floor(Math.sqrt(num));
    		for(int x = 2; x <= limit; x++) {
    			if(num%x == 0) {
    				isPrime = false;
    			}
    		}
    	}
    	return isPrime;
    	
    }      
}
