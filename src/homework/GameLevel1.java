package homework;

public class GameLevel1 extends GameLevel{

	public void simpleAttack(){
		System.out.println("Level 1 - �⺻ ���� : ��Ÿ 1ȸ");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level 1 - ȸ�� ���� : �Ұ����մϴ�.");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level 1 - ���� ���� : �Ұ����մϴ�.");
	}

}
