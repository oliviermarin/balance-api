package com.balance.api.balanceapi.domain;

public class Attendee {

	private Long id;
	private String name;
	private String email;
	private boolean intoArrears;
	private double balance;
	private boolean owner;

	public Attendee () {}

	public Attendee ( String name, String email ) {
		this.name = name;
		this.email = email;
	}

	public Attendee ( Long id, String name, String email, boolean intoArrears, double balance ) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.intoArrears = intoArrears;
		this.balance = balance;
	}

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public boolean isIntoArrears() {
		return intoArrears;
	}

	public void setIntoArrears(boolean intoArrears) {
		this.intoArrears = intoArrears;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public boolean isOwner() {
		return owner;
	}

	public void setOwner(boolean owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
  		return "Attendee{" + "id=" + this.id + ", name=" + this.name + ", email=" + this.email + ", intoArrears=" + this.intoArrears + ", balance=" + this.balance + ", owner=" + this.owner + '}';
	}
}
