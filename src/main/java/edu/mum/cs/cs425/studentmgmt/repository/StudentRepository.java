package edu.mum.cs.cs425.studentmgmt.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import edu.mum.cs.cs425.studentmgmt.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
