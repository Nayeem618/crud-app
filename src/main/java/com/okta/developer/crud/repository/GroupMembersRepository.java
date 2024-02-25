package com.okta.developer.crud.repository;

import com.okta.developer.crud.model.GroupMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMembersRepository extends JpaRepository<GroupMembers,Long> {
}
