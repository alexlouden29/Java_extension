/**
 * @author Alexander Louden
 * Assignment 7, 8.13 + 8.14
 * 05/28/2018
 */

import java.util.Arrays;

public class IntegerSet {
	
	//Handle numbers 0 - 100
	private final static int ARRAY_SIZE = 101;
    
	private boolean[] intSet = new boolean[ARRAY_SIZE]; 
	
	//No-arg constructor (default would be identical, here for  clarity/mutability)
	public IntegerSet (){
		Arrays.fill(intSet, false);
	}
	
	/**
     * INSERTELEMENT
     * Inserts an element into the IntegerSet by setting the corresponding
     * value within the set array to true. Returns false if the value was out
     * of range and true otherwise.
     */
    public boolean insertElement(int element) {
    	
    	//Use variable instead of multiple returns to avoid introducing bugs
    	boolean ret = false;
    	
    	if(element >= 0 && element < ARRAY_SIZE) {
    		this.intSet[element] = true;
    		ret = true;
    	}
    	return ret;
    }
    
    /**
     * DELETEELEMENT
     * Deletes an element from the IntegerSet by setting the corresponding
     * value within the set array to false. Returns false if the value was out
     * of range and true otherwise.
     */
    public boolean deleteElement(int element) {
    	
    	//Use variable instead of multiple returns to avoid introducing bugs
    	boolean ret = false;
    	
    	if(element >= 0 && element < ARRAY_SIZE) {
    		this.intSet[element] = false;
    		ret = true;
    	}
    	return ret;
    }
    
    /**
     * TOSTRING
     * @Override the toString method in the Object class
     * Displays the integers contained by the IntegerSet separated by spaces. 
     * An empty set should be displayed as:
     * { --- }
     * An integer set containing 5 and 10 should be displayed as:
     * { 5 10 }
     */
    @Override
    public String toString() {
    	String set = "";
    	
    	//Add numbers to string
    	for(int x = 0; x < ARRAY_SIZE; x++) {
    		if(this.intSet[x] == true) {
    			set = set + " " + x;
    		}
    	}
    	
    	//empty set
    	if(set == "") {
    		set = "{ --- }";
    	}
    	//add brackets
    	else {
    		set = "{" + set + " }";
    	}
    	
    	return set;
    }
    
    
    /**
     * UNION
     * Return a new IntegerSet containing the union of the two IntegerSet objects
     * passed as arguments
     */
    public static IntegerSet union(IntegerSet a, IntegerSet b) {
    	IntegerSet union = new IntegerSet();
    	
    	for(int x = 0; x < ARRAY_SIZE; x++) {
    		union.intSet[x] =  a.intSet[x] == true || b.intSet[x] == true ? true : false;
    	}
    	
    	return union;
    }
    
    
    /**
     * INTERSECTION
     * Return a new IntegerSet containing the intersection of the two IntegerSet objects
     * passed as arguments
     */
    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
    	IntegerSet union = new IntegerSet();
    	
    	for(int x = 0; x < ARRAY_SIZE; x++) {
    		union.intSet[x] =  a.intSet[x] == true && b.intSet[x] == true ? true : false;
    	}
    	
    	return union;
    }
    
    
    /**
     * ISEQUALTO
     * Returns true iff the current IntegerSet contains the same integers as
     * the IntegerSet supplied as an argument
     */
	public boolean isEqualTo(IntegerSet a){
		boolean ret = true;
		
		for(int x = 0; x < ARRAY_SIZE; x++) {
			if(a.intSet[x] != this.intSet[x]) {
				ret = false;
				break;
			}
		}
		return ret;
	}
}
