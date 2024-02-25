package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, Long> {
}
