package com.timetable;

abstract class User {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String password;

  public User(String name, int age,String email,String phoneNumber,String password){
      setName(name);
      setAge(age);
      setEmail(email);
      setPhoneNumber(phoneNumber);
      setPassword(password);
  }
   //setters
    public void setName(String name){
      if(!name.isEmpty()){
          this.name=name;
      }
    }
    public void setAge(int age){
      if(age>0 & age<100){
        this.age=age;
      }
    }
    public void setEmail(String email){
      if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")){ //checking if email is correct format
            this.email=email;
      }
    }
    public void setPhoneNumber(String phoneNumber){
      if(phoneNumber.matches("[0-9]{11}")){
          this.phoneNumber=phoneNumber;    //need to add exceptions
      }
    }
    public void setPassword(String password){
       if(password.length() >=8 & password.matches(".*[A-Z].*")){
           this.password=password;
       }
    }
        //getters

    public String getName(){return name;}
    public int getAge(){return age;}
    public String getEmail(){return email;}
    public String getPhoneNumber(){return phoneNumber;}
}
