package Methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		

	}
	// Java da method isimleri camelCase ile yaz�l�r.
	
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
			//mesaj = "Say� mevcuttur: " + aranacak;
		mesajVer("Say� mevcuttur" + aranacak); //buraya direk mesaj da g�nderebiliriz.
			
		}else {
			mesajVer("Aran�lan say� mevcut de�ildir. " + aranacak);
		}
	}
	//Parametreli method deniliyor.
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
