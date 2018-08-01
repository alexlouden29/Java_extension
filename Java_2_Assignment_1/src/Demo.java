/*
 * Author: Alexander Louden
 * Date: 7/22/18
 * Assignment: 1
 */

public class Demo {

	public static void main(String[] args) {
	
		//Create Steaks
		Steak myDefaultSteak1 = new Steak();
		Steak myDefaultSteak2 = new Steak();
		Steak myCustomSteak1 = new Steak(Doneness.RAW, 12, SteakType.RIBEYE, 15.75);
		Steak myCustomSteak2 = new Steak(Doneness.MEDIUM, 8, SteakType.FILET_MIGNON, 16.5);
		
		//Set Default1
		myDefaultSteak1.setDoneness(Doneness.WELL_DONE);
		myDefaultSteak1.setOunces(10);
		myDefaultSteak1.setType(SteakType.TRI_TIP);
		myDefaultSteak1.setPrice(20.5);
		
		//Set Default2
		myDefaultSteak2.setDoneness(Doneness.MEDIUM_RARE);
		myDefaultSteak2.setOunces(11);
		myDefaultSteak2.setType(SteakType.T_BONE);
		
		try {
			myDefaultSteak2.setPrice(-1); //Expect error
		}
		catch(Exception e) {
			System.out.println("ERROR: " + e.getMessage()); // Display error message instead of ending program for the sake of this test
		}
		myDefaultSteak2.setPrice(10.0);
		
		//Modify Custom1. Test cut()
		myCustomSteak1.cut(); 
		myCustomSteak1.cut(4); //Expected size = 7

		//Modify Custom2.  Test cook()
		myCustomSteak2.cook(); 
		myCustomSteak2.cook();
		myCustomSteak2.cook(); //Expected Doneness = CHARCOAL
		myCustomSteak2.cook(); //Expected to have no effect, print warning
		
		//Create Steak array
		Steak[] mySteakArray = new Steak[] {myDefaultSteak1, myDefaultSteak2, myCustomSteak1, myCustomSteak2};
		
		//Display all steaks
		for(Steak steak : mySteakArray) {
			steak.display();
			System.out.println();
		}
		
	}

}
