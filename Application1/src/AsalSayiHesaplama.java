
public class AsalSayiHesaplama {

	public static void main(String[] args) {
		//bug = Sistemsel veya mant�ksal hatalara deniliyor.
		int number = 17;
		int remainder = number%2;
		System.out.println(remainder);
		
		boolean isPrime= true;
		
		if(number ==1) {
			System.out.println("Say� asal de�ildir.");
			return;
			
		}
		if(number<1) {
			System.out.println("Ge�ersiz Say� De�eri");
			
		}
		
		for(int i=2; i<number; i++) {
			if(number%2==0) {
				isPrime = false;
			}
			
		}
		if(isPrime) {
			System.out.println("Say� Asald�r");
			
		}else {
			System.out.println("Say� asal de�ildir.");
		}
		

	}

}
