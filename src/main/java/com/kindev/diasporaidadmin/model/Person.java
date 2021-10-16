package com.kindev.diasporaidadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String sex;
    private String dob;
    private String firstLineAddress;
    private String secondLineAddress;
    private String job;
    private String phone;
    private String mail;
    private String maritalStatus;

    public Person(String firstName, String middleName, String lastName, String dob, String sex) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.sex = sex;
    }
}
