package io.chacha.beaba.tables;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String LastName;
	private String mail;
	
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Client(Long id, String firstName, String lastName, String mail) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.mail = mail;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
