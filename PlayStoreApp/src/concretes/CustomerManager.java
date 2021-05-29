package concretes;

import abstracts.ICustomerCheckService;

import entities.Game;

public class CustomerManager implements ICustomerCheckService{

	@Override
	public void buy(Game game) {
		System.out.println("Oyun Satýn Alma Ýþlemi Gerçekleþti " + game.getGameName () + " " + game.getPrice());
		
	}



}
