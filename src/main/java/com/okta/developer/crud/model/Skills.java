package com.okta.developer.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "Skills")
public class Skills {

    @Id
    @GeneratedValue
    private Long skill_id;
    private String skill_name;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Skills() {
    }

    public Skills(String skill_name, Users users) {
        this.skill_name = skill_name;
        this.users = users;
    }

    public Long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(Long skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skill_id=" + skill_id +
                ", skill_name='" + skill_name + '\'' +
                ", users=" + users +
                '}';
    }
}
