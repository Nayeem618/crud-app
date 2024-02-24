package com.okta.developer.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Group_members")
public class GroupMembers {

    @Id
    @GeneratedValue
    private Long group_member_id;
    private Long user_id;
    private  Long group_id;

    @OneToOne
    private Users users;
    private Groups groups;

}
