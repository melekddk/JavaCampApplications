
public class SwitchDemo {

	public static void main(String[] args) {
		//Puanlama sistemi uygulamas�
		
		char grade = 'g';
		
		switch (grade) {
		case 'A':
			System.out.println("M�kemmel, dersi ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok iyi, dersi ge�tiniz");
			break;
		case 'C':
			System.out.println("�yi, dersi ge�tiniz");
			break;
		case 'D':
			System.out.println("Ko�ullu olarak dersi ge�tiniz");
			break;
		case 'F':
			System.out.println("Malesef dersi ge�emediniz.");
			break;

		default:
			System.out.println("Ge�ersiz bir not girdiniz.");
			break;
		}
		
	

	}

}
