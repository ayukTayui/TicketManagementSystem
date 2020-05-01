package za.co.system.entities.people;

public class Employee{
	
	private int idNumber;
	private String name;
	private String surname;
	private String dob;
	private String email; 
	private String username;
	private String password;
	
	
	
	public Employee(int idNumber, String name, String surname, 
			String dob, String email, String username,
			String password) {
		
		this.idNumber = idNumber;
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	
	
	public Employee() {
		
	}



	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String toString() {
		return "Employee [idNumber=" + idNumber + ", name=" + name + ", surname=" + surname + ", dob=" + dob
				+ ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
