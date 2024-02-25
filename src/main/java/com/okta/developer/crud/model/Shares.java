package com.okta.developer.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "Shares")
public class Shares {

    @Id
    @GeneratedValue
    private Long share_id;
    private Long user_id;
    @OneToOne
    @JoinColumn(name = "post_id")
    private Posts posts;

    public Shares() {
    }

    public Shares(Long user_id, Posts posts) {
        this.user_id = user_id;
        this.posts = posts;
    }

    public Long getShare_id() {
        return share_id;
    }

    public void setShare_id(Long share_id) {
        this.share_id = share_id;
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
        return "Shares{" +
                "share_id=" + share_id +
                ", user_id=" + user_id +
                ", posts=" + posts +
                '}';
    }
}
