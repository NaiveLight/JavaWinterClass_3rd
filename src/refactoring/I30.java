package refactoring;

public class I30 extends Car{
	
	String str;

	public I30(){
		str = "I30";
	}
	
	public String getString(){
		return str;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("i30start()");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("i30drive()");	
	}

	@Override
	public void Break() {
		// TODO Auto-generated method stub
		System.out.println("i30Break()");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("i30turnOff()");
	}

}
