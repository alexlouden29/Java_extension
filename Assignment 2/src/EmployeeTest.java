/*
 * EmployeeTest.java
 */

/**
 *
 * @author StudentName
 */
public class EmployeeTest {
    
	//Tester helper method that cuts down on repeated code.
    private static void showEmployeeInfo(Employee employee) {
    	System.out.print(employee.getFirstName() + " ");
        System.out.print(employee.getLastName() + " ");
        System.out.println("has a yearly salary of: " + employee.getMonthlySalary()*12);
    }
	
	public static void main(String args[]){
        
    	// Create two Employee objects
    	//Employee #1: Benjamin Bernanke has a monthly salary of 1234.56
    	//Employee #2: Paul Volcker has a monthly salary of 2345.67
        Employee ben = new Employee("Benjamin", "Bernanke", 1234.56);
        Employee paul = new Employee("Paul", "Volcker", 2345.67);
        
        
        /* Display the employees' info (including yearly salary)
         * A little more complex, but technically more scalable if you wanted to add
         * more employees
         * Just trying to make it more fun for myself.
         */
        Employee[] emps = new Employee[]{ben,paul};
        for(Employee emp : emps){
        	showEmployeeInfo(emp);
        }

        //Give Raises
        System.out.println("Giving raises...");
        for(Employee emp : emps){
        	emp.giveRaise(.1);
        }
        
        //Display Info again
        for(Employee emp: emps) {
        	showEmployeeInfo(emp);
        }
        
        //Test negative salary
        System.out.println("Attempting to set a negative salary value...");
        // Attempt to set Bernanke's salary to a negative value...
        ben.setMonthlySalary(-1000);
        // Display Bernanke's info (including yearly salary)
        showEmployeeInfo(ben);
    }
    
}
