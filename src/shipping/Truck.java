package shipping;

public class Truck extends Vehicle{

	Truck(double distance, double efficiency) {
		super(distance, efficiency);
	}

	@Override
	public double calcTripDistance() {
		return distance;
	}

	@Override
	public double calcFuelEfficiency() {
		// TODO Auto-generated method stub
		return efficiency;
	}

}
