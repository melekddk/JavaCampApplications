package overriding;

public class Main {

	public static void main(String[] args) {
		/*
		 * OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		 * double ToplamTutar= ogretmenKrediManager.hesapla(1000);
		 * System.out.println(ToplamTutar);
		 */

		BaseKrediManager[] krediManagers = new BaseKrediManager[] {
				new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()
		};
		
		for(BaseKrediManager krediManager: krediManagers ) {
			double ToplamFiyat = krediManager.hesapla(1000);
			System.out.println("Toplam kredi fiyatı:" +" "+ ToplamFiyat);
			
		}
	}

}
