package project.signupAndLogin.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import project.signupAndLogin.model.UserSignup;

public interface UserRepository extends MongoRepository<UserSignup,String>{
    @Query("{email:?0}")
    Optional<UserSignup> findByEmail(String email);
  

}
