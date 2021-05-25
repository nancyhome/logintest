package com.b505.demotest.code.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user" )
public class user {

    @Id
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
