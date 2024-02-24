package com.okta.developer.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Profiles")
public class Profiles {

    @Id
    @GeneratedValue
    private Long profile_id;
    private Long user_id;
    private String headline;
    private  String summary;
    private String industry;
    private String website;

    @OneToOne
    private Users users;
}
