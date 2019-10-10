package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TranscriptRepository transcriptRepository;
	
	@Autowired
	private ClassroomRepository classroomRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtApp.class, args);
	}
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	public void saveTranscript(Transcript transcript) {
		transcriptRepository.save(transcript);
	}
	
	public void saveClassroom(Classroom classroom) {
		classroomRepository.save(classroom);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
		LocalDate newDate = LocalDate.parse("2019/05/24", formatter);
		Student s1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, newDate);
		
		Transcript t1 = new Transcript("BS Computer Science", s1);
		s1.setStudentTranscript(t1);
		
		Classroom c1 = new Classroom("McLaughlin Building", "M105");
		c1.addStudent(s1);
		
		saveClassroom(c1);
		saveStudent(s1);
		saveTranscript(t1);

		
		
		
	}

}
