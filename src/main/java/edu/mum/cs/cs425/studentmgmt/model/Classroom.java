package edu.mum.cs.cs425.studentmgmt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLASSROOMS")
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomId;
	
	private String buildingName;
	private String roomNumber;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Student> studentList;
	
	public Classroom() {
		studentList = new ArrayList<Student>();
	}
	
	public Classroom(String buildingName, String roomNumber) {
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public Long getClassroomId() {
		return classroomId;
	}
	
	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
}
