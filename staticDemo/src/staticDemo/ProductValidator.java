package staticDemo;
//ürün kaydedip, güncellerken ürünün kurallara uygun olup olmadýðýný bulmak için kullanýlýr.
public class ProductValidator {
	static {
		System.out.println("Static blok çalýþtý.");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý.");
		
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
