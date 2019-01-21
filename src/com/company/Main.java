package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double accountBalance = 1000.00;
        String lineBreak = ("\n");
        boolean userInput2 = true;
        System.out.println("Hello, What would you like to do today?" + lineBreak + "Enter 1 to Check Balance"
                + lineBreak + "Enter 2 to Withdraw" + lineBreak + "Enter 3 to Deposit" + lineBreak +"Enter 4 to Log Out");

       do {

           double userInput = reader.nextDouble();

           if (userInput == 1) {
               System.out.println(accountBalance);
           } else if (userInput == 2) {
               System.out.println("Enter the amount you would like to withdraw:");
               double withdrawalAmount = reader.nextDouble();
               System.out.println(accountBalance-withdrawalAmount);
           } else if (userInput ==3) {
               System.out.println("Enter the amount you would like to deposit:");
                    double depositAmount = reader.nextDouble();
                    System.out.println(accountBalance + depositAmount);

           } else if (userInput ==4) {
               System.out.println ("Goodbye");
               break;
        }

       }while (userInput2);

    System.out.println ("Thank you!");
    }
}
