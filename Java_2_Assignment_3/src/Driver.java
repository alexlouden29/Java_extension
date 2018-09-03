import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver class that uses Employee.java to create a spreadsheet containing employee data,
 * based on user input.  Prompts user through the command line.
 * @author Alex Louden
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		//Initialize variables
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		//Prompt user
		System.out.print("How many Employees are there: ");
		//Get valid data for number of employees
		int numEmployee = -1;
		while(numEmployee < 0) {
			try{
				numEmployee = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Please provide a valid number.");
			}
		}
		
		//Loop until number of employees requested as been filled out.
		for(int x = 0; x < numEmployee; x++) {
			String name = null;
			double hourlyPay = 0;
			int hours = 0;
			
			//Loop until valid data is provided
			Employee hardworker = null;
			while(hardworker == null) {
				try{
					//Prompt user for all necessary data
					System.out.print("Enter the employee's name: ");
					name = sc.nextLine();
					System.out.print("Enter hourly salary: ");
					hourlyPay = Double.parseDouble(sc.nextLine());
					System.out.print("Enter number of hours worked per week: ");
					hours = Integer.parseInt(sc.nextLine());
				
					//Create employee object and add to arrayList
					hardworker = new Employee(name, hourlyPay, hours);
					emps.add(hardworker);
				}
				catch(IllegalArgumentException | NullPointerException e) {
					System.out.println("\nPlease enter valid data.");
					System.out.println("Name: any string of characters 1 or longer.");
					System.out.println("Hourly Salary: Any decimal or whole number greater than zero.");
					System.out.println("Hours worked: Any whole number larger than 0\n");
				}
			}
		}

		//Create the report
		try{
			Employee.printSalaryReport(emps);
		}
		catch(FileNotFoundException e) {
			System.out.println("Unexpected file error");
		}
		finally {
			sc.close();
		}
		
	}

}
