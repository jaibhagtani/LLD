package com.examples.scalar_schema.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Student extends BaseModel {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;

    @ManyToMany(mappedBy="enrolledStudents")
    private List<Module> enrolledModules;
}

//S : M
//1 -> M
//M <- 1