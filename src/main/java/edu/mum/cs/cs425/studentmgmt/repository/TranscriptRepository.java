package edu.mum.cs.cs425.studentmgmt.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;

@Repository
public interface TranscriptRepository extends CrudRepository<Transcript, Long>{

}
