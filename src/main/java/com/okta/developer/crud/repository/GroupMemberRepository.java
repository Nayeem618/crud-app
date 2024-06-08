package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMemberRepository extends JpaRepository<GroupMember,Long> {
}
