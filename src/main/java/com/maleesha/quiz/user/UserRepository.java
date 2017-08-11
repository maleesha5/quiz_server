package com.maleesha.quiz.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserParent, String> {

}
