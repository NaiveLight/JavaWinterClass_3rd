package shipping;

public abstract class Vehicle {

	double distance;
	double efficiency;
	
	Vehicle(double distance, double efficiency){
		this.distance = distance;
		this.efficiency = efficiency;
	}
	
	public abstract double calcTripDistance();
	public abstract double calcFuelEfficiency();
	
	public final double calcFuelNeeds(){
		return calcTripDistance()/calcFuelEfficiency();
	}
	
}
