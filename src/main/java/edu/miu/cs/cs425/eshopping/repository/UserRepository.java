package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //User findByUserName(String userName);
    Optional<User> findByUsername(String username);
}
