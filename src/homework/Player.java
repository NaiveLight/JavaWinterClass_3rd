package homework;

public class Player {

	private String playerName;
	private int gameLevel;
	
	public Player(String playerName, int gameLevel){
		this.playerName = playerName;
		this.gameLevel = gameLevel;
	}
	
	public void upgradeLevel(){
		gameLevel++;
	}
	
	public int getGameLevel(){
		return gameLevel;
	}
	
	public String getplayerName(){
		return playerName;
	}
	
	public void attack(){
		
	}
}
