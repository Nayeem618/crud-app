package com.okta.developer.crud.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue
    private Long user_id;
    private String email;
    private String password;
    private String  name;
    private String location;
    private Date join_date;
    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profiles profiles;
    @OneToMany(mappedBy = "users")
    private List<Connections> connections;
    @OneToMany(mappedBy = "users")
    private List<Education> education;
    @OneToMany(mappedBy = "users")
    private List<Posts> posts;
    @OneToMany(mappedBy = "users")
    private List<Experience> experience;
    @OneToMany(mappedBy = "users")
    private List<Skills> skills;
    @OneToMany(mappedBy = "users")
    private List<Groups> groups;

    public Users(String email, String password, String name, String location, Date join_date, Profiles profiles, List<Connections> connections, List<Education> education, List<Posts> posts, List<Experience> experience, List<Skills> skills, List<Groups> groups) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.location = location;
        this.join_date = join_date;
        this.profiles = profiles;
        this.connections = connections;
        this.education = education;
        this.posts = posts;
        this.experience = experience;
        this.skills = skills;
        this.groups = groups;
    }


    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public Profiles getProfiles() {
        return profiles;
    }

    public void setProfiles(Profiles profiles) {
        this.profiles = profiles;
    }

    public List<Connections> getConnections() {
        return connections;
    }

    public void setConnections(List<Connections> connections) {
        this.connections = connections;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public List<Groups> getGroups() {
        return groups;
    }

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", join_date=" + join_date +
                ", profiles=" + profiles +
                ", connections=" + connections +
                ", education=" + education +
                ", posts=" + posts +
                ", experience=" + experience +
                ", skills=" + skills +
                ", groups=" + groups +
                '}';
    }
}
