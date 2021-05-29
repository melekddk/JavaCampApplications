package concretes;

import abstracts.IGamerVerification;
import entities.Gamer;

public class EDevletVerificationManager implements IGamerVerification {

	@Override
	public void eDevlet(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() +"oyuncu bilgisi doðrulandý.");
		
	}

}
