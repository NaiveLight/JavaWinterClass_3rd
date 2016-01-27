package homework;

import java.util.ArrayList;

public class PlayerDataBase {

	private ArrayList<Player> playerList;
	
	private static PlayerDataBase instance = new PlayerDataBase();
	private PlayerDataBase(){
		playerList = new ArrayList<Player>();
	}
	
	public static PlayerDataBase getInstance(){
		if (instance == null){
			instance = new PlayerDataBase();
		}
		return instance;
	}
	
	public void addPlayer(Player Player){
		playerList.add(Player);
	}
	
	public ArrayList<Player> getPlayerList(){
		return playerList;
	}
}
	