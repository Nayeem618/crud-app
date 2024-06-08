package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<UserGroup, Long> {
}
