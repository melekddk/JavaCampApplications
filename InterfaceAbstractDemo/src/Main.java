
public class Main {

		
		public static void main(String[] args) {
			BaseCustomerManager customerManager = new NeroCustomerManager();
			customerManager.Save(new Customer("Melek", "DED�K", 1997, "56589635893"));
			
		
			
			
		}

	}