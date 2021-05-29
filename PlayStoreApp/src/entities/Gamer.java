package entities;

public class Gamer {
	
	private int Id;
	private String FirstName;
	private String LastName;
	private int DateOfBirth;
	private int NationalityID;
	private String NameOfTeamPlayed;
	
	public Gamer(int id, String firstName, String lastName, int dateOfBirth, int nationalityID, String nameOfTeamPlayed) {
	
		this.Id=id;
		this.FirstName= firstName;
		this.LastName =lastName;
		this.DateOfBirth=dateOfBirth;
		this.NationalityID= nationalityID;
		this.NameOfTeamPlayed = nameOfTeamPlayed;
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
	
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	
	public void setDateOfBirth(int dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}
	
	public int getNationalityID() {
		return NationalityID;
	}
	
	public void setNationalityID(int nationalityID) {
		this.NationalityID = nationalityID;
	}
	
	public String getNameOfTeamPlayed() {
		return NameOfTeamPlayed;
	}
	
	public void setNameOfTeamPlayed(String nameOfTeamPlayed) {
		this.NameOfTeamPlayed = nameOfTeamPlayed;
	}
	


}
