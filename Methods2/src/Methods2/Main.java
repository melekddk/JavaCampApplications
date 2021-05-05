package Methods2;
public class Main {

	public static void main(String[] args) {
		//operasyon, method, fonksiyon hepsi ayný
		
		//String mesaj = "Bugün hava çok güzel";
		String yeniMesaj =sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(8,18);
		System.out.println(sayi);
		
		int toplam = topla2(1,2,3,4,10,20);
		System.out.println(toplam);
	}
	public static void Ekle() {
		System.out.println("Eklendi");
		
	}
	
	public static void Sil() {
		System.out.println("Silindi");
		
	}
	public static void Güncelle() {
		System.out.println("Güncelledi");
		
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	//variable argument
	public static int topla2(int...sayilar) {
		int toplam =0;
		for(int sayi:sayilar) {
			toplam+=sayi;
			
		}
		return toplam;
		
	}
	public static String sehirVer() {
		return "Bursa";
	}
	

}
