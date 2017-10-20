package com.balance.api.balanceapi.domain;

public class Attendee {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;

	public Attendee () {}

	public Attendee ( String firstname, String lastname, String email ) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public Attendee ( Long id, String firstname, String lastname, String email ) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
