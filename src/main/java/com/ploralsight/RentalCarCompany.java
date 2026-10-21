package com.ploralsight;

// use scanner to get info from user

import java.util.Scanner;

public class RentalCarCompany {

    public static void main(String[] args) {


        //create variables needed to solve
        int Age;
        //start at zero
        double totalCost = 0;
        double dailyCost = 29.99;

        //create scanner
        Scanner input = new Scanner(System.in);
        //ask user how many days are they renting the car
        System.out.print("How many days are you renting the car for?");
        int rentalDays = input.nextInt();
        totalCost = rentalDays * dailyCost;

        // ask if they want an electronic toll tag
        System.out.print("Is true that you want an electronic toll tag? (True or False)");
        boolean electronicTag = input.nextBoolean();
        if (electronicTag) {
            totalCost += (3.95 * rentalDays);
        }

        System.out.print("Is true that you want a Gps? (True or False)");
        boolean gps = input.nextBoolean();
        if (gps) {
            totalCost += (2.95 * rentalDays);
        }
        System.out.print("Is true that you want Road side Assistance Help? (True or False)");
        boolean roadsideAssistance = input.nextBoolean();
        if (roadsideAssistance) {
            totalCost += (3.95 * rentalDays);
        }
        // ask their age and charge them correctly
        System.out.print("How old are you?");
        int age = input.nextInt();
        if (age < 25) {
            totalCost *= 1.3;
        }
        System.out.printf("Total Cost: $%.2f", totalCost);
    }


}
