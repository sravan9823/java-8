package in.sravanit.beans;

public class MyApp {

	public static void main(String[] args) {

		Vehicle vehicle = new I20car();
		vehicle.cleanVehicle();
		vehicle.startVehicle();
		vehicle.sensor();
		
		Vehicle.fuelCheck();
	}

}
