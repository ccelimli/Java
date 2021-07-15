package Kodlamaio.Hrms.Entites.Concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;


@Entity
@Table(name="jobseeker")
@AllArgsConstructor

public class JobSeeker extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String name;
	
	@Column(name="last_name")
	private String surname;
	
	@Column(name="nationality_id")
	private String nationalityID;
	
	@Column(name="birth_year")
	private int birthYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	

	
	
	
	

}
