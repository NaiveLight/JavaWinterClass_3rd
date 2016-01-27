package refactoring;

public class Genesis extends Car{
	
	String str;
	
	public Genesis(){
		str = "Genesis";
	}
	
	public String getString(){
		return str;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("genesisStart()");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("genesisDrive()");
	}

	@Override
	public void Break() {
		// TODO Auto-generated method stub
		System.out.println("genesisBreak()");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("genesisTurnOff()");
	}
}
