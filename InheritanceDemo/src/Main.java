
public class Main {

	public static void main(String[] args) {
		/*
		 * OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		 * ogretmenKrediManager.Hesapla(); TarımKrediManager tarımKrediManager = new
		 * TarımKrediManager(); tarımKrediManager.Hesapla();
		 */
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesala(new AskerKrediManager());

	}

}
