package inheritance;

public class Main {

	public static void main(String[] args) {
		//Customer customer = new Customer();
		//Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.BestEmployee();
		

	}

}
