
public class MultiDimersionalArray {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0]="Ýstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Trabzon";
		sehirler[1][1]="Samsun";
		sehirler[1][2]="Giresun";
		sehirler[2][0]="Edirne";
		sehirler[2][1]="Tekirdað";
		sehirler[2][2]="Kýrklareli";
		
		for(int i =0; i<=2; i++) {
			System.out.println("------------------------------");
			for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
