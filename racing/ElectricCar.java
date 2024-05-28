package racing;

public class ElectricCar extends Car {
	private int batteryCapacity;
	private int range;

	public ElectricCar(String color, String make, int year, String model, int numDoors, String transmissionType,
			int batteryCapacity, int range) {
		super(color, make, model, year, numDoors, transmissionType);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public void display() {
        System.out.println("================= ===================");
		super.display();
		System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
		System.out.println("Range: " + range + " miles");

	}

	public void start() {
		System.out.println("ElectricCar Start....!");
        System.out.println("================= ===================");

	}

}
