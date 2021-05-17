
public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
		int aranacak = 10;
		boolean VarMi = false;
		
		for(int sayi: sayilar) {
			if(sayi ==aranacak) {
				VarMi = true;
				break;
			
				
			}
			
		}
		if(VarMi) {
			System.out.println("Sayý mevcuttur");
			
		}else {
			System.out.println("Sayý bulunmamaktadýr.");
		}
		

	}

}
