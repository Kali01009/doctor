package com.example.doctorsappointment;

public class user {
    
     String  firstName,lastName,age,date;


    public user ( String firstName , String lastName , String age , String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
    }

        public String getFirstName() {

        return firstName;
        }

        public String getLastName() {

        return lastName;
        }

        public String getAge() {

        return age;
        }
        public String getDate(){
        return date;
        }
}
