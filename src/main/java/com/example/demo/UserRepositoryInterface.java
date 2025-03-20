package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryInterface extends MongoRepository<UserEntity, String> {
    // Add custom query methods if needed, like findByEmail, etc.
    // Fetch a user by userId
    @Query("{ 'employeeId' : 'IGZU00119' }")
    UserEntity findUserByEmployeeId(String employeeId);



}