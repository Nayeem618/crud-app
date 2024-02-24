package com.okta.developer.crud.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Group_members")
public class GroupMembers {

    @Id
    @GeneratedValue
    private Long group_member_id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @OneToOne
    @JoinColumn(name = "group_id")
    private Groups groups;

    public GroupMembers(Users users, Groups groups) {
        this.users = users;
        this.groups = groups;
    }

    public Long getGroup_member_id() {
        return group_member_id;
    }

    public void setGroup_member_id(Long group_member_id) {
        this.group_member_id = group_member_id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "GroupMembers{" +
                "group_member_id=" + group_member_id +
                ", users=" + users +
                ", groups=" + groups +
                '}';
    }
}
