package concretes;

import abstracts.ICustomerCheckService;

import entities.Game;

public class CustomerManager implements ICustomerCheckService{

	@Override
	public void buy(Game game) {
		System.out.println("Oyun Sat�n Alma ��lemi Ger�ekle�ti " + game.getGameName () + " " + game.getPrice());
		
	}



}
