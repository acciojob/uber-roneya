package com.driver.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "admins")

public class Admin {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;

    private String username;
    private String password;

    public Admin(){}

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

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