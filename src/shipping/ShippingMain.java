package shipping;

public class ShippingMain {

	public static void main(String[] args) {
		Company company = Company.getInstance();
		
		
		company.addVehicle(new Truck(300, 30)); //distance, eifficiency ±â¸§¾ç 10
		company.addVehicle(new RiverBarge(200, 10)); //distance, eifficiency*2 10
		company.addVehicle(new RiverBarge(200, 5)); //20
		company.addVehicle(new Truck(500, 20)); //25
		company.addVehicle(new RiverBarge(200, 20)); //5
		
		FuelNeedsReport report = new FuelNeedsReport();
		System.out.println(report.getReport());
	}

}
