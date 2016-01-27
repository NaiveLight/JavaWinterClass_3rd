package display;

public class DisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display chdisplay = new CharacterDisplay('H');
		chdisplay.show();
		chdisplay.line();
		
		Display strDisplay = new StringDisplay("Hello, Java");
		strDisplay.show();
	}

}
