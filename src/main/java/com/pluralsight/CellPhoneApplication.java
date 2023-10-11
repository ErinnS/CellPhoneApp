package com.pluralsight;

import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone iPhone = new CellPhone();

        System.out.print("What is the serial number? ");
        iPhone.setSerial(myScanner.nextInt());
        myScanner.nextLine();
        System.out.print("What model is the phone? ");
        iPhone.setModel(myScanner.nextLine());
        System.out.print("Who is the carrier? ");
        iPhone.setCarrier(myScanner.nextLine());
        System.out.print("What is the phone number? ");
        iPhone.setPhoneNumber(myScanner.nextLine());
        System.out.print("Who is the owner of the phone? ");
        iPhone.setName(myScanner.nextLine());




    }
}
