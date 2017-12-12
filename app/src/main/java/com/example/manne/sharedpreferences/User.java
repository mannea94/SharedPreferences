package com.example.manne.sharedpreferences;

/**
 * Created by manne on 12.12.2017.
 */

public class User {
    public String firstName;
    public String lastName;
    public String age;
    public boolean isMale;

    public User(){

    }

    public User(String firstName, String lastName, String age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale=isMale;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isMale() {
        return isMale;
    }
}
