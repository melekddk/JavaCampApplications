
public class SwitchDemo {

	public static void main(String[] args) {
		//Puanlama sistemi uygulamasý
		
		char grade = 'g';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel, dersi geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi, dersi geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi, dersi geçtiniz");
			break;
		case 'D':
			System.out.println("Koþullu olarak dersi geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef dersi geçemediniz.");
			break;

		default:
			System.out.println("Geçersiz bir not girdiniz.");
			break;
		}
		
	

	}

}
