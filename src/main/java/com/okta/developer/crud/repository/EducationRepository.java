package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education,Long> {
}
