package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
