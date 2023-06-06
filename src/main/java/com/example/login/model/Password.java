package com.example.login.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "passwords")
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userid;
    private String password;

    public Password(Long userid, String password) {
        this.userid = userid;
        this.password = password;
    }
}
