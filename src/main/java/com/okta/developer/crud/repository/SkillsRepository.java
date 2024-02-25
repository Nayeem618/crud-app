package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
