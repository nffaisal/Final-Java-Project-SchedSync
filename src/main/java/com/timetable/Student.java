package com.timetable;

public class Student extends User {
    private String studentID;
    //Constructor
    public Student(String name, int age, String email, String phoneNumber, String password, String studentID){
        super(name, age, email, phoneNumber, password);
        this.studentID = studentID;
    }
}
