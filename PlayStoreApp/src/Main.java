import entities.Campaigns;
import entities.Game;

import entities.Gamer;
import concretes.CampaignManager;
import concretes.EDevletVerificationManager;
import concretes.GameManager;


public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,"Melek","DED�K",1997,350214522,"A Tak�m�");
		Gamer gamer2 = new Gamer(2,"An�l","Aymaz",1996,253605252 , "B Tak�m�");
		
		Game game1 = new Game (1,"Puzzle",39.90,25.80,20032021,"Bulmaca");
		Game game2 = new Game (2,"K�zma Birader",59.90,45.80,20032021,"�ocuk Oyunu");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Campaigns campaign1 = new Campaigns (1,"Kad�nlar G�n� Kampanyas�",24032021, 50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.delete(campaign1);;
		
		
		
		EDevletVerificationManager eDevletVerificationManager = new EDevletVerificationManager();
		eDevletVerificationManager.eDevlet(gamer1);
	}

}
