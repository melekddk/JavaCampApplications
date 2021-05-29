package entities;

public class Customer {
	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalityId;
	private int DateOfBirth;
	
	public Customer(int id, String firstName, String lastName, String nationalityId, int dateOfBirth) {
		this.Id = id;
		this.FirstName=firstName;
		this.LastName= lastName;
		this.NationalityId= nationalityId;
		this.DateOfBirth= dateOfBirth;
		
	}
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.NationalityId = nationalityId;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}
	

}
