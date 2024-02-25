package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository<Groups, Long> {
}
