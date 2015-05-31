package edu.iit.model;

import java.util.List;



public class Doctor {
	private String cin;
	private String firstName;
	private String lastName;
	private List<String> preferences;
	private List<Vacance> vacances;
	public Doctor(){
		
	}
	public Doctor(String cin, String firstName, String lastName,
			List<String> preferences, List<Vacance> vacances) {
		super();
		this.cin = cin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.preferences = preferences;
		this.vacances = vacances;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getPreferences() {
		return preferences;
	}
	public void setPreferences(List<String> preferences) {
		this.preferences = preferences;
	}
	public List<Vacance> getVacances() {
		return vacances;
	}
	public void setVacances(List<Vacance> vacances) {
		this.vacances = vacances;
	}
	@Override
	public String toString() {
		return "Doctor [cin=" + cin + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", preferences=" + preferences
				+ ", vacances=" + vacances + "]";
	}
	
	

}
