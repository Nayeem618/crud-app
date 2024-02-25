package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Connections;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectionsRepository extends JpaRepository<Connections,Long> {
}
