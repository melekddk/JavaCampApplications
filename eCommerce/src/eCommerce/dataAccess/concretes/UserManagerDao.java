package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManagerDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getUserName() + " " + user.getUserLastName() + "kullan�c� eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " " + user.getUserLastName() + "kullan�c� g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " " + user.getUserLastName() + "kullan�c� silindi.");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
	
