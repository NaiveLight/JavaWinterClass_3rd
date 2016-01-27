package homework;

public class GameLevel3 extends GameLevel {

	public void simpleAttack(){
		System.out.println("Level 3 - 기본 공격 : 평타 3회");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level 3 - 회전 공격 : 돌려차기 2회.");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level 3 - 공중 공격 : 날라차기 1회.");
	}
}
