package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Share;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareRepository extends JpaRepository<Share,Long> {
}
