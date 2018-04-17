/*
 * Employee.java
 */

/**
 * Assignment 2
 * @author Alexander Louden
 * Created 4/16/2018
 */
public class Employee {
    
	//Instance Variables
    private String firstName;
    private String lastName;
    private double monthlySalary;
	
    
    /******* Constructors ********/
    
    //Constructor.  Takes in 3 arguments for first and last name, and monthly salary.
    public Employee(String firstName, String lastName, double monthlySalary) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	if(monthlySalary >= 0) {
    		this.monthlySalary = monthlySalary;
    	}
    }
    
    //Bonus constructor.  Requires that full name be typed without a comma, and a space
    //between the first and last name.  First name comes first.
    //Actually untested, just made for fun
    public Employee(String name, double monthlySalary) {
    	String[] nameArray = name.split(" ");
    	this.firstName = nameArray[0];
    	this.lastName = nameArray[1];
    	this.monthlySalary = monthlySalary;
    }
    
    
    /********** Getters ************/
    //Access First Name
    public String getFirstName() {
    	return this.firstName;
    }
    
    //Access Last Name
    public String getLastName() {
    	return this.lastName;
    }
    
    //Access Monthly Salary
    public double getMonthlySalary() {
    	return this.monthlySalary;
    }
    
    
    /*********** Setters ************/
    //Set First Name
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    
    //Set Last Name
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    //Set Monthly Salary
    //This cannot be negative, and apparently not zero either.
    //Pro Bono work just isn't allowed around here.
    public void setMonthlySalary(double monthlySalary) {
    	if(monthlySalary > 0) {
    		this.monthlySalary = monthlySalary;
    	}
    }
    
    
    /****** Methods *******/
    
    /* Takes in a decimal representing a percentage.  I.E. .1 = 10%.
     * Gives a raise to the employee
     * Can be negative or zero
     * Returns new salary because who knows, that could be useful.
     * Cuts down on repetitive code in the tester, because I can't stand that
     */
    public double giveRaise(double raisePercent) {
    	this.monthlySalary = this.monthlySalary *(1+raisePercent);
    	return this.monthlySalary;
    }
}
