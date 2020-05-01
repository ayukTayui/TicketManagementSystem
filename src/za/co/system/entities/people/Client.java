package za.co.system.entities.people;


import java.util.Arrays;

import za.co.system.entities.tickets.Ticket;

public class Client{
	private int idNumber;
	private String name;
	private String middlename;
	private String surname;
	private String dob;
	private String email;
	private String homeAddress;
	private String country;
	 
	private Ticket[] tickets;

	
	
	
	public Client(int idNumber, String name, String middlename, String surname, String dob, String email,
			String homeAddress, String country, Ticket[] tickets) {
		
		this.idNumber = idNumber;
		this.name = name;
		this.middlename = middlename;
		this.surname = surname;
		this.dob = dob;
		this.email = email;
		this.homeAddress = homeAddress;
		this.country = country;
		this.tickets = tickets;
	}

	public Client() {
		
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

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
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

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Ticket[] getTicket() {
		return tickets;
	}

	public void setTicket(Ticket[] tickets) {
		this.tickets = tickets;
	}

	@Override
	public String toString() {
		return "Client [idNumber=" + idNumber + ", name=" + name + ", middlename=" + middlename + ", surname=" + surname
				+ ", dob=" + dob + ", email=" + email + ", homeAddress=" + homeAddress + ", country=" + country
				+ ", tickets=" + Arrays.toString(tickets) + "]";
	}

	
}
