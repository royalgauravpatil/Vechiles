package racing;

public class Main {

	public static void main(String[] args) {
		
		Truck T = new Truck("Blue", "BMW", 2019, "model-10", "Automatic", 5);
        System.out.println("Truck Info:");
		T.display();
		T.start();

		ElectricCar EC = new ElectricCar("Black", "Ford", 1990, "f-123", 3, "Auto", 20, 100);
        System.out.println("Electric Car Info:");
		EC.display();
		EC.start();
		
		GasolineCar GC = new GasolineCar("skyblue", "make", 2002, "big", 23, "auto", 10, 200);
		System.out.println("Gasoline Car Info:");
		GC.display();
		GC.start();
	
		
	}

}
