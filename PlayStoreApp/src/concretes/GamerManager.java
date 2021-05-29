package concretes;

import abstracts.IGamerService;
import entities.Gamer;

public class GamerManager implements IGamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Ekleme ��lemi Ger�ekle�ti " + " " + gamer.getNameOfTeamPlayed()+ " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu G�ncelleme ��lemi Ger�ekle�ti " + " " + gamer.getNameOfTeamPlayed()+ " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silme ��lemi Ger�ekle�ti " + " " + gamer.getNameOfTeamPlayed()+ " " + gamer.getLastName());
		
	}

}
