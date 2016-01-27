package shipping;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	
	private static Company instance = new Company();
	private ArrayList<Vehicle> arr;
	private Company(){
		arr = new ArrayList<>();
	}
	
	public static Company getInstance(){
		if(instance == null){
			instance = new Company();
		}
		return instance;
	}

	public void addVehicle(Vehicle Vehicle) {
		arr.add(Vehicle);
	}
	
	public ArrayList<Vehicle> getArr(){
		return arr;
	}
}
