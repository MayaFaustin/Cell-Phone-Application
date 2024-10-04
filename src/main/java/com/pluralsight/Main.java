package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone c1 = new CellPhone();

        System.out.println("What is the serial number?");
        c1.serialNumber = reader.nextInt();
        reader.nextLine();

        System.out.println("What model is the phone?");
        c1.cellPhoneModel = reader.nextLine();

        System.out.println("Who is the carrier?");
        c1.phoneCarrier = reader.nextLine();

        System.out.println("What is the phone number?");
        c1.phoneNumber = reader.nextLine();

        System.out.println("Who is the owner of the phone?");
        c1.phoneOwner = reader.nextLine();


        System.out.println("Serial Number: " + c1.getSerialNumber() +
                "\n" + "Cell Phone Model:" + c1.getCellPhoneModel() +
                "\n" + "Phone Carrier: " + c1.getPhoneCarrier() +
                "\n" + "Phone number: " + c1.getPhoneNumber() +
                "\n" + "Phone Owner: " + c1.getPhoneOwner()
        );

    }

}