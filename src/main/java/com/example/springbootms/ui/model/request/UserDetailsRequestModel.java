package com.example.springbootms.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserDetailsRequestModel {
    @NotNull(message = "must include first name")
    private String firstName;
    @NotNull(message = "must include last name")
    private String lastName;
    @NotNull(message = "must include email")
    @Email
    private String email;
    @NotNull(message = "must include password")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}
