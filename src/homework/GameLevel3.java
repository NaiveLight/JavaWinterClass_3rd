package homework;

public class GameLevel3 extends GameLevel {

	public void simpleAttack(){
		System.out.println("Level 3 - �⺻ ���� : ��Ÿ 3ȸ");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level 3 - ȸ�� ���� : �������� 2ȸ.");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level 3 - ���� ���� : �������� 1ȸ.");
	}
}
