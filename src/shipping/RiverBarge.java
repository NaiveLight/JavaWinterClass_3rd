package shipping;

public class RiverBarge extends Vehicle {

	RiverBarge(double distance, double efficiency) {
		super(distance, efficiency);
	}

	@Override
	public double calcTripDistance() {
		return distance;
	}

	@Override
	public double calcFuelEfficiency() {
		return efficiency*2;
	}

}
