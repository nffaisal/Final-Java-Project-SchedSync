package com.timetable;

public class Teacher extends User {
        private String position;

        public Teacher(String name,int age, String email,String phoneNumber, String password,String position){
            super(name,age,email,phoneNumber,password);
            this.position=position;
        }

}
