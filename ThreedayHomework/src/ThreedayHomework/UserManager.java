package ThreedayHomework;
public class UserManager {
	public void delete(User user) {
		System.out.println(user.getFirstName() + " ki�isi silindi.");
	}
	
	public void deleteMultipleUser(User[] users) {
		for(User user : users) {
			delete(user);
		}
	}

}
