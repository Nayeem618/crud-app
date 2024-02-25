package com.okta.developer.crud.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Comments")
public class Comments {
    @Id
    @GeneratedValue
    private  Long comment_id;
    private Long user_id;
    private String content;
    private Date comment_date;
    @OneToOne
    @JoinColumn(name = "post_id")
    private Posts posts;

    public Comments() {
    }
    public Comments(Long user_id, String content, Date comment_date, Posts posts) {
        this.user_id = user_id;
        this.content = content;
        this.comment_date = comment_date;
        this.posts = posts;
    }

    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "comment_id=" + comment_id +
                ", user_id=" + user_id +
                ", content=" + content +
                ", comment_date=" + comment_date +
                ", posts=" + posts +
                '}';
    }
}
