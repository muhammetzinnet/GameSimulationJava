package Entity;

import java.util.Date;

public class Player implements Entity {
	
	private int Id;
	private String FirstName;
	private String LastName;
	private String IdentificationNumber;
	private Date dateOfBirth;
	
	public Player() {
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getIdentificationNumber() {
		return IdentificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		IdentificationNumber = identificationNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
