package com.maleesha.quiz.answer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnswerRepository extends MongoRepository<AnswerDTO, String> {

	
}
