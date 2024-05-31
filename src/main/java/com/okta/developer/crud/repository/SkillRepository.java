package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
