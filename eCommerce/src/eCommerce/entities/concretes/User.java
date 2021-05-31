package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String userName;
	private String userLastName;
	private String eMail;
	private String userPassword;
	private Boolean userVerify;
	
	public User() {
		
	}

	public User(int id, String userName, String userLastName, String eMail, String userPassword, Boolean userVerify) {
		super();
		this.id = id;
		this.userName = userName;
		this.userLastName = userLastName;
		this.eMail = eMail;
		this.userPassword = userPassword;
		this.setUserVerify(userVerify);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Boolean getUserVerify() {
		return userVerify;
	}

	public void setUserVerify(Boolean userVerify) {
		this.userVerify = userVerify;
	}
	

}
