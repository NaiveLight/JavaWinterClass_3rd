package homework;

public class GameLevel2 extends GameLevel{

	public void simpleAttack(){
		System.out.println("Level 2 - 기본 공격 : 평타 2회");
	}

	@Override
	public void turnAttack() {
		System.out.println("Level 2 - 회전 공격 : 돌려차기 1회.");
	}

	@Override
	public void flyingAttack() {
		System.out.println("Level 2 - 공중 공격 : 불가능합니다.");
	}

}
