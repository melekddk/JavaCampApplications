
public class AsalSayiHesaplama {

	public static void main(String[] args) {
		//bug = Sistemsel veya mantıksal hatalara deniliyor.
		int number = 17;
		int remainder = number%2;
		System.out.println(remainder);
		
		boolean isPrime= true;
		
		if(number ==1) {
			System.out.println("Sayı asal değildir.");
			return;
			
		}
		if(number<1) {
			System.out.println("Geçersiz Sayı Değeri");
			
		}
		
		for(int i=2; i<number; i++) {
			if(number%2==0) {
				isPrime = false;
			}
			
		}
		if(isPrime) {
			System.out.println("Sayı Asaldır");
			
		}else {
			System.out.println("Sayı asal değildir.");
		}
		

	}

}
