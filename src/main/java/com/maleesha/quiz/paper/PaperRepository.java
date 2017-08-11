package com.maleesha.quiz.paper;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaperRepository extends MongoRepository<PaperDTO, String>{

}
