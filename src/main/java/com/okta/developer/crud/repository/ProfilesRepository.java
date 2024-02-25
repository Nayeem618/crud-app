package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Profiles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilesRepository extends JpaRepository<Profiles, Long> {
}
