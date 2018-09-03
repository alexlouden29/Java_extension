import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * The employee class represents any type of employee paid hourly.  Stores the employees name,
 * hourly wage, and hours worked per week.  Can calculate weekly wage.
 * 
 * @author Alex Louden
 */
public class Employee {

	private String name;
	private double hourlyPay;
	private int hours;
	
	/**
	 * Default Constructor.
	 * Default values: John Doe, 11.50 an hour, 40 hours per week.
	 */
	public Employee() {
		this("John Doe", 11.50, 40);
	}
	
	/**
	 * Constructor for employee class.
	 * @param name The name of the employee.
	 * @param hourlyPay The employee's hourly pay
	 * @param hours The number of hours worked in a week.
	 */
	public Employee(String name, double hourlyPay, int hours) {
		if(name == "" || name == null) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		if(hourlyPay < 0) {
			throw new IllegalArgumentException("Hourly pay cannot be negative.");
		}
		if(hours < 0) {
			throw new IllegalArgumentException("Hours worked cannot be negative.");
		}
		this.name = name;
		this.hourlyPay = hourlyPay;
		this.hours = hours;
	}
	
	//Setters
	/**
	 * Setter for Employee's name
	 * @param name The name of the employee.
	 * @throws IllegalArgumentException if name is blank.
	 */
	public void setName(String name) {
		if(name == "" || name == null) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		this.name = name;
	}
	
	/**
	 * Setter for the employee's hourly pay.
	 * @param hourlyPay The employee's hourly pay.
	 * @throws IllegalArgumentException If hourly pay is negative.
	 */
	public void setHourlyPay(double hourlyPay) {
		if(hourlyPay < 0) {
			throw new IllegalArgumentException("Hourly pay cannot be negative.");
		}
		this.hourlyPay = hourlyPay;
	}
	
	/**
	 * Setter for the employee's number of hours worked in a week.
	 * @param hours The number of hours worked in a week.
	 * @throws IllegalArgumentException If hours worked is negative.
	 */
	public void setHours(int hours) {
		if(hours < 0) {
			throw new IllegalArgumentException("Hours worked cannot be negative.");
		}
		this.hours = hours;
	}
	
	//Getters
	/**
	 * Getter for employee's name
	 * @return String The employee's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Getter for employee's hourly pay.
	 * @return double The employee's hourly pay
	 */
	public double getHourlyPay() {
		return this.hourlyPay;
	}
	
	/**
	 * Getter for employee's hours worked.
	 * @return int The number of hours worked.
	 */
	public int getHours() {
		return this.hours;
	}
	
	
	//Methods
	/**
	 * Takes in an arrayList of type Employee, and outputs all data including weekly salary to "employee.csv", with one employee per row.
	 * @param employees An ArrayList of employee objects.
	 * @throws FileNotFoundException Unexpected error thrown by PrintWriter
	 */
	public static void printSalaryReport(ArrayList<Employee> employees) throws FileNotFoundException {
		
		//Initialize variables
		PrintWriter output = new PrintWriter("employee.csv");
		
		String sep = ",";
		
		//Create header row
		output.println("Employee Name,Salary,Hours,Weekly Pay");
		
		//Print employee rows
		for(Employee employee : employees) {
			StringBuilder sb = new StringBuilder();
			sb.append(employee.getName() + sep);
			sb.append(employee.getHourlyPay() + sep);
			sb.append(employee.getHours() + sep);
			sb.append(employee.getWeeklyPay());
			output.println(sb.toString());
		}
		
		//Close the file
		output.close();
		
	}
	
	/**
	 * Calculates weekly pay based on hours worked and hourly pay.
	 * @return double The weekly pay.
	 */
	public double getWeeklyPay() {
		return this.hourlyPay * hours;
	}
	
}
