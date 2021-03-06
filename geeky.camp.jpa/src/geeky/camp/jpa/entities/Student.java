package geeky.camp.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
public class Student implements Serializable {
	   
	@Id
	private String facultyNumber;
	private String firstName;
	private String lastName;
	private Integer credits;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	//small hint ;)
//	@ManyToMany
//	private Collection<Course> courses;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	
	public Student(String facultyNumber, String firstName, String lastName,
			Integer credits, Date birthDate) {
		this.facultyNumber = facultyNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.credits = credits;
		this.birthDate = birthDate;
	}


	public String getFacultyNumber() {
		return this.facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public Integer getCredits() {
		return this.credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	
	@Override
	public String toString() {
		return "Student [facultyNumber=" + facultyNumber + ", firstName="
				+ firstName + ", lastName=" + lastName + ", credits=" + credits
				+ ", birthDate=" + birthDate + "]";
	}
}
