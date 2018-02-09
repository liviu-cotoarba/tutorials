package com.cotoarba.tutorials.builder;

/**
 * Model class used to illustrate the builder pattern
 */
public class Person {
	private String lastName;
	private String firstName;
	private String city;
	private boolean employed;
	private boolean homeOwner;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isEmployed() {
		return employed;
	}

	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

	public boolean isHomeOwner() {
		return homeOwner;
	}

	public void setHomeOwner(boolean homeOwner) {
		this.homeOwner = homeOwner;
	}
}