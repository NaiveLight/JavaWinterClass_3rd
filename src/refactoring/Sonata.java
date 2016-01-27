package refactoring;

public class Sonata extends Car {

	String str;
	
	public Sonata(){
		str = "Sonata";
	}
	
	public String getString(){
		return str;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("sonataStart()");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("sonataDrive()");
	}

	@Override
	public void Break() {
		// TODO Auto-generated method stub
		System.out.println("sonataBreak()");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("sonataTurnOff()");
	}
	
}
