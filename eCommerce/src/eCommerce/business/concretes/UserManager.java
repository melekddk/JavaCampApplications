package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.GoogleService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	
	private List<String> eMail = new ArrayList<String>();
	private List<String> password = new ArrayList<String>();

	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager (UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	
	}
	public static boolean emailValid(String eMail) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		return matcher.matches();
	
	}
	public static boolean emailValidOnClick(String email) {
		return true;

	}
	
	
	
	@Override
	public void register(User user) {
		if(user.getUserPassword().length() < 8 || user.getUserPassword() == null) {
			System.out.println("Parolan�z en az 8 karakterli olmas� gerekmektedir.");
			return;
		}
		else if(eMail.contains(user.geteMail())){
			System.out.println("Girdi�iniz mail adresi ile bir hesap mevcuttur.");
			return;
			
		}
		else if(user.getUserName() == null || user.getUserLastName()== null) {
			System.out.println("Ad ve soyad k�sm� bo� ge�ilemez");
			return;
			
		}
		else {
			System.out.println("Mail adresine gelen onay kodunu onaylay�n");
		}
		
		if(emailValidOnClick(user.geteMail())) {
			System.out.println("Kay�t i�leminiz ba�ar�l� bir �ekilde ger�ekle�mi�tir.");
		
		
			eMail.add(user.geteMail());
			password.add(user.getUserPassword());
			this.userDao.add(user);
			this.googleService.registerToSystem(null);
		
		}else {
			System.out.println("Tekrar deneyin.");
		}
		
		
		
		
	}

	@Override
	public void login(String eMail, String userPassword) {
		if(eMail.contains(eMail) && password.contains(userPassword)) {
			System.out.println("Sisteme ba�ar�l� bir �ekilde giri� yap�ld�");
		}else {
			System.out.println("Mail adresini veya parolan�z hatal� tekrar deneyiniz.");
		}
		
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
