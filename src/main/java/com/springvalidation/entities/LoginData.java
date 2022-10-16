package com.springvalidation.entities;

import javax.validation.constraints.*;

public class LoginData {

    @NotBlank(message ="User name can not be empty !!")
    @Size(min = 3, max = 12, message = "User name must be between 3-12!")
    private String userName;

    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "InValid email")
    private String email;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    @Override
    public String toString() {
        return "LoginData{" +
                "userName=" + userName +
                ", email=" + email +
                '}';
    }




}
