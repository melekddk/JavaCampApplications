package ThreedayHomework;
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Melek");
		instructor1.setLastName("Dedik");
		
		
		Student student1 = new Student();
		student1.setFirstName("Ali");
		student1.setLastName("Aymaz");
		
		
		UserManager userManager = new UserManager();
		
		User[] users = { instructor1, student1};
		
		userManager.deleteMultipleUser(users);
		
		
		
		

	}

}
