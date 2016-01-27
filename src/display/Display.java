package display;

public abstract class Display {

	public abstract void start();
	public abstract void display();
	public abstract void end();
	
	//final = 변수에 사용하면 상수가 됨 , 
	//method에 사용하면 하위 클래스에서 overriding 불가, 
	//class에서 사용하면 상속 불가
	
	public final void show(){
		start();
		for(int i = 0; i < 5; i++){
			display();
		}
		end();
	}
	
	public void line(){
		System.out.println("");
	}
	
}
