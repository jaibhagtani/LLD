package com.examples.scalar_schema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Module extends BaseModel{
    private String name;

//    but here, it is already mapped and it is forming 2 tables
//    for same relation, there it should not happen
    @ManyToMany
    private List<Student> enrolledStudents;

    @OneToMany(mappedBy = "module")
    private List<ModuleExam> moduleExams;
}

//Module : ME
//1 : M
//1 : 1
//1 to M