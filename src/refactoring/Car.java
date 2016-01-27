package refactoring;

public abstract class Car {

	public abstract void start();
	public abstract void drive();	
	public abstract void Break();
	public abstract void turnOff();
	
	public final void run(){
		start();
		drive();
		Break();
		turnOff();
		System.out.println("");
	}

	public String 
	public final void washCar(){
		String str = Car.getString();
		System.out.println("washCar()");
		System.out.println("");
	}
}
