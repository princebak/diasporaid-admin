package com.kindev.diasporaidadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String username;
    String password;
    String userType;
    Person person;

    public User(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
}
