package com.dagger.example.data;


public class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName(){
        return firstName;
    }

    public String lastName(){
        return lastName;
    }
}
