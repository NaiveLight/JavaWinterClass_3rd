package display;

public abstract class Display {

	public abstract void start();
	public abstract void display();
	public abstract void end();
	
	//final = ������ ����ϸ� ����� �� , 
	//method�� ����ϸ� ���� Ŭ�������� overriding �Ұ�, 
	//class���� ����ϸ� ��� �Ұ�
	
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
