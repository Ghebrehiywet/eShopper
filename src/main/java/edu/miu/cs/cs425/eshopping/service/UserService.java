package edu.miu.cs.cs425.eshopping.service;


import edu.miu.cs.cs425.eshopping.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User find(Long id);

    Optional<User> findByUserName(String userName);

    User put(User User);
}
