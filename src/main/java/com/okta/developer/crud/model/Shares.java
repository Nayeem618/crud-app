package com.okta.developer.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Shares")
public class Shares {

    @Id
    @GeneratedValue
    private Long share_id;
    private Long post_id;
    private Long user_id;
    @OneToOne
    private Posts posts;

}
