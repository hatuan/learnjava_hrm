package org.example.entities;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name", length = 50, nullable = false, unique = true)
    private String userName;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "enabled", columnDefinition = "integer default 1")
    private int enabled;

    public Users() {
    }
    
}