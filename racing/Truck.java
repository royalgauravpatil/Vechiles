package racing;

public class Truck extends Vehicle{

	private String bedSize;
	private int towingCapacity;
	
	public Truck(String color, String make, int year, String model, String bedSize, int towingCapacity) {
		super(color, make, model, year);
		this.bedSize = bedSize;
		this.towingCapacity = towingCapacity;
	}

	public String getBedSize() {
		return bedSize;
	}

	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}

	public int getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

	@Override
	public void display()
	{
        System.out.println("================= ===================");
		super.display();
		System.out.println("Bed Size: " + bedSize + " cubic feet");
        System.out.println("Towing Capacity: " + towingCapacity + " pounds");

	}

	@Override
	public void start() {
		System.out.println("start truck .....!");    
		System.out.println("================= ===================");

	}
	
	
	
}
