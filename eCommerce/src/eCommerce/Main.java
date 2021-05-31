package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.core.JGoogleManagerAdapter;

import eCommerce.dataAccess.concretes.UserManagerDao;
import eCommerce.entities.concretes.User;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new UserManagerDao(), new JGoogleManagerAdapter());
		
		User user1 = new User(1,"Melek", "DEDÝK","melekdedik@gmail.com","53645230", true);

		userManager.register(user1);
		userManager.login(user1.geteMail(), user1.getUserPassword());
	}

}
