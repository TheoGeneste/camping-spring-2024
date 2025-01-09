package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id_user", nullable = false)
    private Integer id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "roles")
    private String roles;

}