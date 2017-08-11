package com.maleesha.quiz.question;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface McqRepository extends MongoRepository<McqQuestionDTO, String>{

	
}
