package com.kindev.diasporaidadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration {
    private String Id;
    private Date saveDate;
    private Person concerned;
    private Person mother;
    private Person father;
    private User firstValidator;
    private User secondValidator;
    private List<Person> children;
    private List<String> pictures;

    public Registration(String id, Date saveDate, Person concerned, Person mother, Person father, List<Person> children, List<String> pictures) {
        Id = id;
        this.saveDate = saveDate;
        this.concerned = concerned;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pictures = pictures;
    }
}
