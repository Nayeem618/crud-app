package com.okta.developer.crud.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Connections")
public class Connections {

    @Id
    @GeneratedValue
    private Long connection_id;
    private Long user_id;
    private Long connection_user_id;
    private String connection_status;

    @OneToOne
    private Users users;
}
