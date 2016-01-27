package refactoring;

public abstract class Car {

	public abstract void start();
	public abstract void drive();	
	public abstract void Break();
	public abstract void turnOff();
	public abstract String getString();
	
	public final void run(){
		start();
		drive();
		Break();
		turnOff();
		System.out.println("");
	}

	
	public final void washCar(){
		String str = getString();
		System.out.println(str+" washCar()");
		System.out.println("");
	}
}
