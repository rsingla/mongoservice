package com.techcodepro.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personProfile")
public class PersonProfile {

	String firstName;
	String lastName;
	String email;

	
	public String getFirstName() {
		return firstName;
	}
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonProfile [firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + "]";
	}
}
