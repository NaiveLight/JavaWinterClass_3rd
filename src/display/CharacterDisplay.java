package display;

public class CharacterDisplay extends Display{

	private char ch;
	
	public CharacterDisplay(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.print("<<");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print(ch);
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		System.out.print(">>");
	}
	

}
