package com.okta.developer.crud.model;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Groups")
public class Groups {

    @Id
    @GeneratedValue
    private Long group_id;
    private String group_name;
    private String description;
    private Date created_date;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @OneToMany(mappedBy = "groups")
    private List<GroupMembers> groupMembers;

    public Groups() {
    }

    public Groups(String group_name, String description, Date created_date, Users users, List<GroupMembers> groupMembers) {
        this.group_name = group_name;
        this.description = description;
        this.created_date = created_date;
        this.users = users;
        this.groupMembers = groupMembers;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<GroupMembers> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<GroupMembers> groupMembers) {
        this.groupMembers = groupMembers;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "group_id=" + group_id +
                ", group_name='" + group_name + '\'' +
                ", description='" + description + '\'' +
                ", created_date=" + created_date +
                ", users=" + users +
                ", groupMembers=" + groupMembers +
                '}';
    }
}
