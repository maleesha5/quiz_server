package com.maleesha.quiz.admin;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<AdminDTO, String>{

}
