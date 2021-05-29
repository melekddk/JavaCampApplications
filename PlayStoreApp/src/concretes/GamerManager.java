package concretes;

import abstracts.IGamerService;
import entities.Gamer;

public class GamerManager implements IGamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Ekleme Ýþlemi Gerçekleþti " + " " + gamer.getNameOfTeamPlayed()+ " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncelleme Ýþlemi Gerçekleþti " + " " + gamer.getNameOfTeamPlayed()+ " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silme Ýþlemi Gerçekleþti " + " " + gamer.getNameOfTeamPlayed()+ " " + gamer.getLastName());
		
	}

}
