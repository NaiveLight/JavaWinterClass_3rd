package shipping;

import java.util.ArrayList;

public class FuelNeedsReport {
	
	private ArrayList<Vehicle> arr;
	private double total;
	
	public FuelNeedsReport(){
		Company company = Company.getInstance();
		arr = company.getArr();
	}
	
	public double getReport() {
		for(int i = 0; i < arr.size(); i++){
			total += arr.get(i).calcFuelNeeds();
		}
		return total;
	}

}
