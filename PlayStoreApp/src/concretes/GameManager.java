package concretes;

import abstracts.IGameService;
import entities.Game;


public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Ekleme ��lemi Ger�ekle�ti " + game.getGameName() +" "+ game.getDiscountProductsPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun G�ncelleme ��lemi Ger�ekle�ti " + game.getGameName() +" "+ game.getDiscountProductsPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silme ��lemi Ger�ekle�ti " + game.getGameName() +" "+ game.getDiscountProductsPrice());
		
	}

}
