package racing;

public class GasolineCar extends Car{
	private int fuelCapacity;
	private int mpg;
	public GasolineCar(String color, String make, int year, String model, int numDoors, String transmissionType,
			int fuelCapacity, int mpg) {
		super(color, make, model, year, numDoors, transmissionType);
		this.fuelCapacity = fuelCapacity;
		this.mpg = mpg;
	}
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

	@Override
	public void display()
	{
        System.out.println("================= ===================");
		super.display();
		 System.out.println("Fuel Capacity: " + fuelCapacity + " gallons");
	        System.out.println("MPG: " + mpg + " miles per gallon");

	}
	public void start() {
		System.out.println("GasolineCar Start....!");
        System.out.println("================= ===================");


	}

}
