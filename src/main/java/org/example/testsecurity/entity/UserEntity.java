package org.example.testsecurity.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity {

    @Id @GeneratedValue
    private int id;
    @Column(unique=true) // 유저이름 유니크하게
    private String username;
    private String password;
    private String role;

}