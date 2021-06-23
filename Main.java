package com.alepis.java;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        //Create new object -- call the constructor
        AddressBook addressBook = new AddressBook();

        //Initialize variables for user's input
        String input, s;
        int cs;

        while(true){
            //Create a menu for user choices
            input= JOptionPane.showInputDialog("-----[Address Book]-----"+"\n [1] Add" + "\n [2] Search \n [3] Delete"+
                    "\n [4] Display"+"\n [5] Update Contacts"+"\n [6] Exit");

            //input return an integer
            cs = Integer.parseInt(input);

            switch (cs){
                case 1:
                    //add Contact
                    addressBook.addContact();
                    break;
                case 2:
                    //Search Contact with name parameter
                    s = JOptionPane.showInputDialog("Enter name to search");
                    addressBook.searchContacts(s);
                    break;
                case 3:
                    //Delete contact with name parameter
                    s = JOptionPane.showInputDialog("Enter name to delete");
                    addressBook.deleteContacts(s);
                    break;
                case 4:
                    //Display contacts
                    addressBook.displayContacts();
                    break;
                case 5:
                    //Update contact with name parameter
                    s = JOptionPane.showInputDialog("Enter the name of the contact which you want to Update");
                    addressBook.UpdateContacts(s);
                    break;

                case 6:
                    //Exit -- menu
                    JOptionPane.showMessageDialog(null, "Are you sure, you want to quit?");
                    input = JOptionPane.showInputDialog("Press [1] for YES\n"+"Press [2] for NO");
                    cs = Integer.parseInt(input);
                    if (cs==1){
                        System.exit(0);
                    }else{
                        break;
                    }

            }

        }
    }



}
