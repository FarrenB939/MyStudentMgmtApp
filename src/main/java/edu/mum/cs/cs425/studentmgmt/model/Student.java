package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;

import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.List;

import edu.mum.cs.cs425.studentmgmt.model.Transcript;

@Entity
@Table(name = "STUDENTS")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	private String studentNumber;
	private String firstName;
	
	@Nullable
	private String middleName;
	
	private String lastName;
	
	@Nullable
	private Double cgpa;
	
	private LocalDate dateOfEnrollment;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="transcript_fk")
	private Transcript studentTranscript;
	
	@ManyToMany(mappedBy="studentList")
	private List<Classroom> classroomList;
	
	public Student() {
		
	}
	
	public Student(String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public Transcript getStudentTranscript() {
		return studentTranscript;
	}
	
	public void setStudentTranscript(Transcript studentTranscript) {
		this.studentTranscript = studentTranscript;
	}
	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}
}
