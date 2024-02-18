package com.okta.developer.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Skills")
public class Skills {

    @Id
    @GeneratedValue
    private Long skill_id;
    private Long user_id;
    private String skill_name;

    @OneToOne
    private Users users;
}
