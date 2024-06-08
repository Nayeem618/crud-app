package com.okta.developer.crud.model;
import javax.persistence.*;

@Entity
public class GroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer groupMemberId;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private UserGroup group;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters


    public Integer getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(Integer groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public UserGroup getGroup() {
        return group;
    }

    public void setGroup(UserGroup group) {
        this.group = group;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
