package display;

public class StringDisplay extends Display {

	private String string;
	
	public StringDisplay(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		int len = string.getBytes().length;
		
		for(int i = 0; i < len; i++){
			System.out.print('~');
		}
		System.out.println("");		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		int len = string.getBytes().length;
		for(int i = 0; i < len; i++){
			System.out.print('=');
		}
	}

}
