package racing;

public class Car extends Vehicle {
	private int numDoors;
	private String transmissionType;

	public Car(String color, String make, String model, int year, int numDoors, String transmissionType) {
		super(color, make, model, year);
		this.numDoors = numDoors;
		this.transmissionType = transmissionType;
	}

	@Override
	public void display() {
		super.display();
        System.out.println("================= ===================");
		 System.out.println("Number of Doors: " + numDoors);
	        System.out.println("Transmission Type: " + transmissionType);
	}

	public  void start() 
	{
		System.out.println("Start car...!");
        System.out.println("================= ===================");

	}
	
}
