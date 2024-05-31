package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Connection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectionRepository extends JpaRepository<Connection,Long> {
}
