package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.UserLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<UserLike, Long> {
}
