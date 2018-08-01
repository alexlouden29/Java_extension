/*
 * Author: Alexander Louden
 * Date: 7/22/18
 * Assignment: 1
 */



/* These should be defined in their own file in order to be public, but give the instructions to
 * have only two files I chose not to.
 */
enum Doneness{RAW, RARE, MEDIUM_RARE, MEDIUM, MEDIUM_WELL, WELL_DONE, CHARCOAL};
enum SteakType{FILET_MIGNON, NEW_YORK_STRIP, RIBEYE, TRI_TIP, T_BONE, SIRLOIN};


public class Steak {
	
	//Enums
	
	
	/******** Instance Variables ************/
	private Doneness doneness;
	private int ounces;
	private SteakType type;
	private double price;
	
	/************** Constructors ***************/
	//Default
	public Steak() {
		this.doneness = Doneness.RAW;  //Default to RAW, because once you cook it, you can't go back!
		this.ounces = 8;
		this.type = SteakType.RIBEYE; //Default to the best type of steak
		this.price = 0; //Default to the ideal price
	}
	
	
	public Steak(Doneness doneness, int ounces, SteakType type, double price  ) {
		String error = ""; //Allows throwing of multiple errors
		
		this.doneness = doneness; //Test if an issue is possible here
		this.type = type;
		
		//Prevent negative ounces
		if(ounces < 0) {
			error += " Ounces cannot be negative. ";
		}
		else {
			this.ounces = ounces;
		}
		
		//Prevent negative price
		if(price < 0) {
			error += " Price cannot be negative. ";
		}
		else {
			this.price = price;
		}
		
		if(!error.isEmpty()) {
			throw new IllegalArgumentException(error);
		}
	}
	
	/************* Getters **************/
	public Doneness getDoneness(){
		return this.doneness;
	}
	
	public SteakType getType() {
		return this.type;
	}
	
	public int getOunces() {
		return this.ounces;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	/************** Setters **************/
	public void setDoneness(Doneness doneness) {
		this.doneness = doneness;
	}
	
	//Probably shouldn't be allowed to change type of a steak, but how picky do we really want to get.
	public void setType(SteakType type) {
		this.type = type;
	}
	
	public void setOunces(int ounces) {
		//Prevent negative ounces
		if(ounces < 0) {
			throw new IllegalArgumentException("Ounces cannot be negative.");
		}
		else {
			this.ounces = ounces;
		}
	}
	
	public void setPrice(double price) {
		//Prevent negative price
		if(price < 0) {
			throw new IllegalArgumentException("Price cannot be negative.");
		}
		else {
			this.price = price;
		}
	}

/**************** Methods *****************/

	//Display to stdout
	public void display() {
		System.out.printf("Doneness = %s%n", getDoneness());
		System.out.printf("Ounces = %d%n", getOunces());
		System.out.printf("Type = %s%n", getType());
		System.out.printf("Price = $%.2f%n", getPrice());
	}

	//Increase cook level by one.  If cook level is charcoal, do nothing.
	public void cook() {
		if(this.doneness == Doneness.CHARCOAL) {
			System.out.println("Can't really cook more from here!");
		}
		else {
			this.doneness = Doneness.values()[this.doneness.ordinal() + 1];
		}
	}
	
	//Default cut
	public void cut() {
		this.ounces--;
	}
	
	//Overload cut, with parameter ounces, the amount to be cut off
	public void cut(int ounces) {
		this.ounces -= ounces;
	}
}









