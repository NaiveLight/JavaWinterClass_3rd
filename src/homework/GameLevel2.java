package homework;

public class GameLevel2 extends GameLevel{

	public void simpleAttack(){
		System.out.println("Level 2 - �⺻ ���� : ��Ÿ 2ȸ");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level 2 - ȸ�� ���� : �������� 1ȸ.");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level 2 - ���� ���� : �Ұ����մϴ�.");
	}

}
