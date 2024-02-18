package com.okta.developer.crud.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue
    private Long user_id;
    private String email;
    private String password;
    private String  name;
    private String location;
    private Instant  join_date;

    @OneToOne
    private Profiles profiles;
    @OneToMany
    private Connections connections;
    private Education education;
    private Posts posts;
    private Experience experience;
    private Skills skills;
    @OneToMany
    private Groups groups;


}
