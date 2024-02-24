package com.okta.developer.crud.model;

import javax.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Posts")
public class Posts {
    @Id
    @GeneratedValue
    private Long post_id;
    private String content;
    private Instant post_date;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @OneToMany(mappedBy = "posts")
    private List<Comments> comments;
    @OneToMany(mappedBy = "posts")
    private List<Likes> likes;
    @OneToMany(mappedBy = "posts")
    private List<Shares> shares;

    public Posts(String content, Instant post_date, Users users, List<Comments> comments, List<Likes> likes, List<Shares> shares) {
        this.content = content;
        this.post_date = post_date;
        this.users = users;
        this.comments = comments;
        this.likes = likes;
        this.shares = shares;
    }

    public Long getPost_id() {
        return post_id;
    }

    public void setPost_id(Long post_id) {
        this.post_id = post_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getPost_date() {
        return post_date;
    }

    public void setPost_date(Instant post_date) {
        this.post_date = post_date;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public List<Likes> getLikes() {
        return likes;
    }

    public void setLikes(List<Likes> likes) {
        this.likes = likes;
    }

    public List<Shares> getShares() {
        return shares;
    }

    public void setShares(List<Shares> shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "post_id=" + post_id +
                ", content='" + content + '\'' +
                ", post_date=" + post_date +
                ", users=" + users +
                ", comments=" + comments +
                ", likes=" + likes +
                ", shares=" + shares +
                '}';
    }
}
