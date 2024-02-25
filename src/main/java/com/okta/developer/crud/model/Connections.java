package com.okta.developer.crud.model;


import javax.persistence.*;

@Entity
@Table(name = "Connections")
public class Connections {

    @Id
    @GeneratedValue
    private Long connection_id;
    private Long connection_user_id;
    private String connection_status;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Connections() {
    }

    public Connections(Long connection_user_id, String connection_status, Users users) {
        this.connection_user_id = connection_user_id;
        this.connection_status = connection_status;
        this.users = users;
    }

    public Long getConnection_id() {
        return connection_id;
    }

    public void setConnection_id(Long connection_id) {
        this.connection_id = connection_id;
    }

    public Long getConnection_user_id() {
        return connection_user_id;
    }

    public void setConnection_user_id(Long connection_user_id) {
        this.connection_user_id = connection_user_id;
    }

    public String getConnection_status() {
        return connection_status;
    }

    public void setConnection_status(String connection_status) {
        this.connection_status = connection_status;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Connections{" +
                "connection_id=" + connection_id +
                ", connection_user_id=" + connection_user_id +
                ", connection_status='" + connection_status + '\'' +
                ", users=" + users +
                '}';
    }
}
