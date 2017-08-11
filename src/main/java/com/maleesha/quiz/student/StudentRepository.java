package com.maleesha.quiz.student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentDTO, String> {

	StudentDTO findOneByemail(String email);

}
