package com.examples.scalar_schema.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentModuleExam extends BaseModel{
//    CARDINALITY
//    ModuleExam : Module
//    1 : 1
//    M : 1
//    => M : 1

    @ManyToOne
    private Student student;

    //    ModuleExam : Exam
    //    1 : 1
    //    M : 1
    //    => M : 1

    @ManyToOne
    private ModuleExam moduleExam;

    int marks;
}


//if the type of an attribute of a class is a data type,
//that is also being persisted
//=> We are talking about relation betn two classes
//=> MUST Specify what is the cardinality of relation
//So that Spring boot can create tables appropriately