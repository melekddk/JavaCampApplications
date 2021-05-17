package staticDemo;
//�r�n kaydedip, g�ncellerken �r�n�n kurallara uygun olup olmad���n� bulmak i�in kullan�l�r.
public class ProductValidator {
	static {
		System.out.println("Static blok �al��t�.");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�.");
		
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
			
		}else {
			return false;
		}
		
	}
	public void bisey() {
		
	}
	

}
