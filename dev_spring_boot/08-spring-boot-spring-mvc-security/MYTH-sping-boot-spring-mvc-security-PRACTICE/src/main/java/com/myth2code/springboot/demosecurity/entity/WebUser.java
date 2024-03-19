package com.myth2code.springboot.demosecurity.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class WebUser {

    @NotNull(message = "Is required")
    @Size(min = 1, message = "Is required")
    private String username;

    @NotNull(message = "Is required")
    @Size(min = 1, message = "Is required")
    private String password;

    public WebUser(){

    }

    public WebUser(String username, String password) {
        this.username = username;
        this.password = password;
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
