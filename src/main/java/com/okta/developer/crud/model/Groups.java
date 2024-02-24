package com.okta.developer.crud.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Groups")
public class Groups {

    @Id
    @GeneratedValue
    private Long group_id;
    private Long user_id;

    private String group_name;

    private String description;

    private Date created_date;

    @OneToOne
    private Users users;
    @OneToMany
    private GroupMembers groupMembers;
}
