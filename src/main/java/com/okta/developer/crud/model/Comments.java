package com.okta.developer.crud.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "Comments")
public class Comments {
    @Id
    @GeneratedValue
    private  Long comment_id;
    private Long post_id;
    private Long user_id;
    private Long content;
    private Date comment_date;

    @OneToOne
    private Posts posts;


}
