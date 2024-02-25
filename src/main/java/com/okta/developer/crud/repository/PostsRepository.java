package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
