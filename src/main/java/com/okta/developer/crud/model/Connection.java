package com.okta.developer.crud.model;
import javax.persistence.*;

@Entity
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer connectionId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "connected_user_id")
    private User connectedUser;

    private String connectionStatus;

    // Getters and Setters


    public Integer getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Integer connectionId) {
        this.connectionId = connectionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getConnectedUser() {
        return connectedUser;
    }

    public void setConnectedUser(User connectedUser) {
        this.connectedUser = connectedUser;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }
}
