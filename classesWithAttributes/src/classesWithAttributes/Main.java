package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	   Product product = new Product(2,"Laptop", "Acer Laptop", 8000, 8,"Kýrmýzý") {};
		/*
		 * Product product = new Product(); product.setId(1); product.setName("Laptop")
		 * ; product.setDescription ("Azure Laptop"); product.setPrice(5000 );
		 * product.setStockAmount( 6);
		 */
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		//System.out.println(product._name + ":" + product._price );

	}

}
