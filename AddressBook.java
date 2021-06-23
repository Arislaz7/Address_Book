package com.alepis.java;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


class AddressBook {
    //Create an array with contacts

    ArrayList<Contacts> contacts;

    //Constructor
    public AddressBook() {
        contacts = new ArrayList<Contacts>();
    }

    //Add new contact in address Book
    public void addContact() {
        String name = JOptionPane.showInputDialog("Enter name:");
        String surname = JOptionPane.showInputDialog("Enter surname");
        String address = JOptionPane.showInputDialog("Enter address");
        String email = JOptionPane.showInputDialog("Enter email");
        String telephoneNumber = JOptionPane.showInputDialog("Enter Telephone number");
        String birthday = JOptionPane.showInputDialog("Enter BirthdayDate");
        //Create an object c (contact "c")
        Contacts c = new Contacts(name, surname, address, email ,telephoneNumber, birthday);
        //Add in array "contacts" a new contact "c"
        contacts.add(c);

        //serialize
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("contact" +
                            ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/contact.ser");
            JOptionPane.showMessageDialog(null, "Serialized data is saved in /tmp/contact.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    //Search Contacts
    public void searchContacts(String name) {

        //Iterating over array("contacts") and search contact with specific name
        for (int i = 0; i < contacts.toArray().length; i++) {
            Contacts c = (Contacts) contacts.get(i);

            if (name.equals(c.getName())) {
                //Display contact's info which is found
                c.ContactInfo();
            }
        }
    }

    //Delete Contacts
    public void deleteContacts(String name) {
        //Iterating over array("contacts") and search contact with specific name
        for (int i = 0; i < contacts.toArray().length; i++) {
            Contacts c = (Contacts) contacts.get(i);
            if (name.equals(c.getName())) {
                //Display contact info
                c.ContactInfo();
                //Delete contact
                contacts.remove(i);
            }
        }
    }

    //displayContacts
    public void displayContacts() {

        //Check if array is empty
        if (contacts.isEmpty()){
            JOptionPane.showMessageDialog(null,"No Contacts in Address-Book");
        }

        //Iterating over array("contacts") and display contacts
        for (int i = 0; i < contacts.toArray().length; i++) {
            //JOptionPane.showMessageDialog(null, "Contacts in Address Book: \n" + contacts.get(i));
            JOptionPane.showMessageDialog(null, contacts.toString());

        }
    }


    //UpdateContacts
    public void UpdateContacts(String name){

        //Search Contact in array "contacts"  with specific name
        for (int i=0; i<contacts.toArray().length; i++){
            Contacts c = (Contacts)contacts.get(i);

            if (name.equals(c.getName())){
                c.ContactInfo();
                String input;
                int cs;

                //What do you want to change? (name||surname||Address||email||Birthdate)
                input= JOptionPane.showInputDialog("          [OPTIONS]\n"+"\n Enter [1] for the name" +
                        "\n Enter [2] for the surname \n Enter [3] for the Address" + "\n Enter [4] for the Email"+
                        "\n Enter [5] for the Telephone Number"+"\n Enter [6] for the Birthdate");
                cs = Integer.parseInt(input);

                //for name
                if (cs==1) {
                    String new_name = JOptionPane.showInputDialog("Change the name:");
                    c.setName(new_name);
                    JOptionPane.showMessageDialog(null, "The name has changed");
                    break;

                //for surname
                }else if (cs==2){
                    String new_surname = JOptionPane.showInputDialog("Change the surname:");
                    c.setSurname(new_surname);
                    JOptionPane.showMessageDialog(null, "The surname has changed");
                    break;

                //for address
                }else if (cs==3){
                    String new_address = JOptionPane.showInputDialog("Change the address:");
                    c.setAddress(new_address);
                    JOptionPane.showMessageDialog(null, "The Address has changed");
                    break;

                //for email
                }else if(cs==4){
                    String new_email = JOptionPane.showInputDialog("Change the email:");
                    c.setEmail(new_email);
                    JOptionPane.showMessageDialog(null, "The Email has changed");
                    break;

                }else if(cs==5){
                    String new_telephoneNumber = JOptionPane.showInputDialog("Change the Telephone Number:");
                    c.setTelephone_number(new_telephoneNumber);
                    JOptionPane.showMessageDialog(null, "The Telephone Number has changed");
                    break;

                //for Birthdate
                }else if(cs==6){
                    String new_birthdate = JOptionPane.showInputDialog("Change the Birthdate:");
                    c.setBirthday(new_birthdate);
                    JOptionPane.showMessageDialog(null, "The Birthdate has changed");
                    break;

                }


            }
        }
    }

}
