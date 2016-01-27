package homework;

import java.util.ArrayList;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerDataBase playerdata = PlayerDataBase.getInstance();
		
		playerdata.addPlayer(new Player("tomas" , 1));
		playerdata.addPlayer(new Player("jason" , 2));
		playerdata.addPlayer(new Player("william" , 3));

		ArrayList<Player> list = new ArrayList<Player>();
		list = playerdata.getPlayerList();
		
		for(int i = 0; i < list.size(); i++){
			switch (list.get(i).getGameLevel()){
			case 1:
				GameLevel lev = new GameLevel1();
				lev.play();
				break;
				
			case 2:
				GameLevel lev2 = new GameLevel2();
				lev2.play();
				break;
				
			case 3:
				GameLevel lev3 = new GameLevel3();
				lev3.play();
				break;
			}
		}
			
	}

}
