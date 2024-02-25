package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments ,Long> {
}
