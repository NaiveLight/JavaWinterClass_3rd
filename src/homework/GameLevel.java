package homework;

import java.util.ArrayList;

public abstract class GameLevel {
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	PlayerDataBase playerdata = PlayerDataBase.getInstance();
	private ArrayList<Player> playerList = playerdata.getPlayerList();
	;
	private String name;
	private int level;
	private int index;
	
	public void play(){
		start();
		simpleAttack();
		turnAttack();
		flyingAttack();
		end();
	}
	
	public void start(){
		name = playerList.get(index).getplayerName();
		level = playerList.get(index).getGameLevel();
		System.out.println("level " + level + " " + name + " ��  Attack ����");
	}
	
	public void end(){
		name = playerList.get(index).getplayerName();
		level = playerList.get(index++).getGameLevel();
		System.out.println("level " + level + " " + name + " ��  Attack ����");
	}
}
