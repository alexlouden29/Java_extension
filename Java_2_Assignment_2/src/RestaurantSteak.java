
public class RestaurantSteak extends Steak {
	
	//Instance Variables
	private String restaurant;
	
	/************ Constructors ***************/
	
	//Default Constructor
	public RestaurantSteak() {
		super();
		this.restaurant = "Black Angus";
	}
	
	public RestaurantSteak(Doneness doneness, int ounces, SteakType type, double price, String restaurant  ) {
		super(doneness, ounces, type, price);
		this.restaurant = restaurant;
	}
	
	/************ Getters/Setters ************/
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	
	public String getRestaurant() {
		return this.restaurant;
	}
	
	/************* Methods ****************/
	@Override
	public void display() {
		super.display();
		System.out.printf("Restaurant: %s%n", this.restaurant);
	}
}
