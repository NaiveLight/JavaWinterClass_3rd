package homework;

public class GameLevel1 extends GameLevel{

	public void simpleAttack(){
		System.out.println("Level 1 - 기본 공격 : 평타 1회");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level 1 - 회전 공격 : 불가능합니다.");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level 1 - 공중 공격 : 불가능합니다.");
	}

}
