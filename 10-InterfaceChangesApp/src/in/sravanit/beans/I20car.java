package in.sravanit.beans;

public class I20car implements Vehicle {

	@Override
	public void cleanVehicle() {
		System.out.println("I20 car getting cleaned ......");
	}
	
	@Override
	public void sensor() {
		System.out.println("Overridden Sensor method in I20");
	}

}
