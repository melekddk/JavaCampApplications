
public class ArrayDemo {

	public static void main(String[] args) {
		
		String ogrenci1="Melek";
		String ogrenci2="ALi";
		String ogrenci3="Deniz";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println("--------------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Melek";
		ogrenciler[1]="Ali";
		ogrenciler[2]="Deniz";
		ogrenciler[3]="Ümmü Mihcen";
		
		for(int i =0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------------------------------------");
		
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
			
		}

	}

}
