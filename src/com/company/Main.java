package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double accountBalance = 1000.00;
        String lineBreak = ("\n");
        boolean userInput2 = true;
        boolean runAgain = true;
        String answer;
        do {
            System.out.println("Hello, What would you like to do today?" + lineBreak + "Enter 1 to Check Balance"
                    + lineBreak + "Enter 2 to Withdraw" + lineBreak + "Enter 3 to Deposit" + lineBreak +"Enter 4 to Log Out");

           double userInput = reader.nextDouble();

           if (userInput == 1) {
               System.out.println(accountBalance);
           } else if (userInput == 2) {
               System.out.println("Enter the amount you would like to withdraw:");
               double withdrawalAmount = reader.nextDouble();
               System.out.println(accountBalance-withdrawalAmount);

               System.out.println("Would you like to another transaction? Y or N");
               answer = reader.next();
               if (answer.equals("Y")){
                   runAgain = true;
               }else {
                   runAgain = false;
               }

           } else if (userInput ==3) {
               System.out.println("Enter the amount you would like to deposit:");
                    double depositAmount = reader.nextDouble();
                    System.out.println(accountBalance + depositAmount);

           } else if (userInput ==4) {
               System.out.println ("Goodbye");
               break;
        } else {
               System.out.println ("Please enter number 1-4");
           }

       }while (runAgain);

    System.out.println ("Thank you!");

    }


    }

