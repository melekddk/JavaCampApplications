
public class LoopDemo {

	public static void main(String[] args) {
		
		//For Döngüsü
		
		for(int i =1; i<=10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For döngü iþlemi bitti.");

		
		//While Döngüsü
		
		int i =0;
		while (i<=10) {
			System.out.println(i);
			i+=2;
		}
	
		System.out.println("While döngü iþlemi bitti.");
		
		
		//Do-While Döngüsü
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<=10);
		
		System.out.println("Do-While döngü iþlemi bitti.");
	}

}
