package org.example;

public class StudentRecords {

    public String firstName;
    public String middleName;

    public String lastName;

    public String city;


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getFullName(){
        return firstName + " " + middleName + " " + lastName + " " + city;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getCity(){
        return city;
    }

}
