/*
 * BasePlusCommissionEmployeeComposition.java
 */

/*
 * Author: Alexander Louden
 * 06/02/2018
 * Assignment 8
 * Exercise 9.3
 */

public class BasePlusCommissionEmployeeComposition {
    
    private double baseSalary; // base salary per week
    private CommissionEmployee ComEmp; //Composition Implementation
    
    // six-argument constructor
    public BasePlusCommissionEmployeeComposition( String first, String last, 
            String ssn, double sales, double rate, double salary) {
    	this.ComEmp = new CommissionEmployee(first, last, ssn, sales, rate);
    	
    	//Do not allow negative salary
    	if(salary < 0) {	
    		throw new IllegalArgumentException("Gross sales must be >= 0.0");
    	}
    	this.baseSalary = salary;
    }
    
    //Getters and Setters
    public void setBaseSalary( double salary ) {
    	//Do not allow negative salary
    	if(salary < 0) {	
    		throw new IllegalArgumentException("Gross sales must be >= 0.0");
    	}
    	this.baseSalary = salary;
    }    

    public double getBaseSalary() {
    	return this.baseSalary;
    }

    public String getFirstName() {
    	return this.ComEmp.getFirstName();
    }

    public String getLastName() {
    	return this.ComEmp.getLastName();
    }

    public String getSocialSecurityNumber() {
    	return this.ComEmp.getSocialSecurityNumber();
    }

    public double getGrossSales() {
    	return this.ComEmp.getGrossSales();
    }

    public void setGrossSales(double sales) {
    	this.ComEmp.setGrossSales(sales);
    }

    public double getCommissionRate() {
    	return this.ComEmp.getCommissionRate();
    }

    public void setCommissionRate(double rate) {
    	this.ComEmp.setCommissionRate(rate);
    }    
    
    public double earnings() {
    	return this.baseSalary + (getCommissionRate() * getGrossSales());
    }
    
    @Override
    public String toString() {  
    	String ret = "";
    	ret += "base-salaried commission employee: " + getFirstName() + "\n";
    	ret += "gross sales: " + getGrossSales() + "\n";
    	ret += "commission rate: " + getCommissionRate() + "\n";
    	ret += "base salary: " + getBaseSalary() + "\n";
    	return ret;
    }
}
