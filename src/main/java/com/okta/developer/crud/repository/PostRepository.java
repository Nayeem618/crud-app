package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
