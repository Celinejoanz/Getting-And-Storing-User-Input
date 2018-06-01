package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstInitial;
        String lastName;
        long houseNumber;
        String streetName;
        String streetType;
        String city;

        System.out.println( "First Initial:");
        firstInitial = keyboard.next();
        System.out.println( "Last Name:");
        lastName = keyboard.next();
        System.out.println( "House Address:");
        houseNumber = keyboard.nextLong();
        streetName = keyboard.next();
        streetType = keyboard.next();
        city = keyboard.next();

        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
