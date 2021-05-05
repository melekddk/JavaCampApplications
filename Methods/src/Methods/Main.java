package Methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		

	}
	// Java da method isimleri camelCase ile yazýlýr.
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
		int aranacak = 10;
		boolean VarMi = false;
		
		for(int sayi: sayilar) {
			if(sayi ==aranacak) {
				VarMi = true;
				break;
			
				
			}
			
		}
		
		//String mesaj ="";
		if(VarMi) {
			//mesaj = "Sayý mevcuttur: " + aranacak;
		mesajVer("Sayý mevcuttur" + aranacak); //buraya direk mesaj da gönderebiliriz.
			
		}else {
			mesajVer("Aranýlan sayý mevcut deðildir. " + aranacak);
		}
	}
	//Parametreli method deniliyor.
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
