
public class MukemmelSayiExamp {

	public static void main(String[] args) {
		//6=1,2,3
		//28= 1,2,4,7,14 mükemmel sayý
		
		int number =28;
		int toplam =0;
		
		for(int i =1; i<number; i++) {
			if(number%i==0) {
				toplam = toplam+i;
			}
			
		}
		if(toplam == number) {
			System.out.println("Mükemmel sayýdýr.");
			
		}else {
			System.out.println("Mükemmel sayý deðildir.");
		}

	}

}
