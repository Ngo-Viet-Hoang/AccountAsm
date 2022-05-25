package com.example.accountasm.entity;

public class Account {
    private int id;
    private String fullName;
    private String username;
    private String email;
    private String password;
    private int Status;

    public Account() {
    }

    public Account(String fullName, String username, String email, String password, int status) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        Status = status;
    }

    public Account(int id, String fullName, String username, String email, String password, int status) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
