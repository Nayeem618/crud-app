package com.okta.developer.crud.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "Posts")
public class Posts {
    @Id
    @GeneratedValue
    private Long post_id;
    private Long user_id;
    private String content;
    private Instant post_date;

    @OneToOne
    private Users users;
    @OneToMany
    private Comments comments;
    private Likes likes;
    private Shares shares;
}
