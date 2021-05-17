
public class Example2 {

	public static void main(String[] args) {
		double [] myList = {1.2,2.5,3.6,4.8,5.5,6.7,7.1,8.4,9.2};
		double total=0;
		double max = myList[0];
		
		for(double number: myList) {
			if(max<number) {
				max = number;
			}
			total = total+number;
			System.out.println(number);
			
		}
		System.out.println("Sonuç = " +" " +total);
		System.out.println("En Büyük Sayý = " +" " +max);

	}

}
