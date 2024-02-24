package com.okta.developer.crud.model;


import javax.persistence.*;

@Entity
@Table(name = "Likes")
public class Likes {
    @Id
    @GeneratedValue
    private Long like_id;
    private Long  user_id;
    @OneToOne
    @JoinColumn(name = "post_id")
    private Posts posts;


    public Likes(Long user_id, Posts posts) {
        this.user_id = user_id;
        this.posts = posts;
    }

    public Long getLike_id() {
        return like_id;
    }

    public void setLike_id(Long like_id) {
        this.like_id = like_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Likes{" +
                "like_id=" + like_id +
                ", user_id=" + user_id +
                ", posts=" + posts +
                '}';
    }
}
