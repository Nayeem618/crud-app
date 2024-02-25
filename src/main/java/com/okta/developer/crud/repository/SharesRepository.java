package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Shares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharesRepository extends JpaRepository<Shares,Long> {
}
