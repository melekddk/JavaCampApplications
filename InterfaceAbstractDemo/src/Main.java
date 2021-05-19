
public class Main {

		
		public static void main(String[] args) {
			BaseCustomerManager customerManager = new NeroCustomerManager();
			customerManager.Save(new Customer("Melek", "DEDÝK", 1997, "56589635893"));
			
		
			
			
		}

	}