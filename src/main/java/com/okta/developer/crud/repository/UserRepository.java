package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

   // User findByUsername(String username);
}
