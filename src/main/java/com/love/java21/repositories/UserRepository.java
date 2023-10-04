package com.love.java21.repositories;

import com.love.java21.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends MongoRepository<User, String> {
}