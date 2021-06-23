package com.alepis.java;

import javax.swing.*;
import java.io.Serializable;

//Create class Contacts
public class Contacts implements Serializable {
    //Variables
    private String name;
    private String surname;
    private String address;
    private String email;
    private String telephone_number;
    private String birthday;
    private String toString;

    //Constructor
    public Contacts(String name, String surname, String address,String email,String telephone_number
                    ,String birthday) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.telephone_number = telephone_number;
        this.birthday = birthday;

    }

    //GETTERS/SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getTelephone_number() {
        return telephone_number;
    }
    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public void Contacts(String name, String surname , String telephone_number,
                             String address , String email , String birthday){
        setName(name);
        setSurname(surname);
        setAddress(address);
        setEmail(email);
        setTelephone_number(telephone_number);
        setBirthday(birthday);
    }

    //display ContactInfo
    public void ContactInfo(){
        JOptionPane.showMessageDialog(null,"name: " + name + "\nsurname: " + surname + "\nAddress: " + address +"\nEmail: " + email +
                "\nTelephone number: " + telephone_number + "\nBirthday: " + birthday);
    }

    public String toString() {
        return "\n<CONTACT INFORMATIONS >\n" + " Name: " + name + "\n Surname: " + surname +
                "\n Address: " + address + "\n Email: " + email + "\n Telephone number: " + telephone_number + "\n Birthday: " + birthday ;
    }






}
