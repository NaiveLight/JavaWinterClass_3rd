package homework;

import java.util.ArrayList;

public abstract class GameLevel {
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	private int index = Board.index;
	private ArrayList<Player> playerList;
	
	public void play(){
		start();
		simpleAttack();
		turnAttack();
		flyingAttack();
		end();
	}
	
	public void start(){
		PlayerDataBase playerdata = PlayerDataBase.getInstance();
		playerList = playerdata.getPlayerList();
		String name = playerList.get(index).getplayerName();
		int level = playerList.get(index).getGameLevel();
		
		System.out.println(level + " " + name + " 의  Attack 시작");
	}
	
	public void end(){
		PlayerDataBase playerdata = PlayerDataBase.getInstance();
		playerList = playerdata.getPlayerList();
		String name = playerList.get(index).getplayerName();
		int level = playerList.get(index).getGameLevel();
		
		System.out.println(level + " " + name + " 의  Attack 종료");
	}
}
