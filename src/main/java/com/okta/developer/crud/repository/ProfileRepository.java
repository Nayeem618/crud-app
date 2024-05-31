package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
