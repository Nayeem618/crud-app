package com.okta.developer.crud.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Likes")
public class Likes {
    @Id
    @GeneratedValue
    private Long like_id;
    private  Long post_id;
    private Long  user_id;

    @OneToOne
    private Posts posts;
}
