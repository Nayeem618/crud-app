package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
