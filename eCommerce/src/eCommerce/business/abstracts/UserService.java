package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserService {
	void register (User user);
	void login(String eMail, String userPassword);
	
	List<User> getAll();

}
