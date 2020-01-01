package USPS;

import java.util.Scanner;

public class Homework12_30 {
    public static void main(String[] args) {

        System.out.println("Homework from 12/30 (Conditional Statements)");
        System.out.println();

        System.out.println("Homework Question #1");
        System.out.println();

        boolean isGuestOneVegan = true;
        boolean isGuesttwoVegan = true;

        if (isGuestOneVegan && isGuesttwoVegan) {
            System.out.println("Here is the vegan menu");
        } else if (isGuestOneVegan || isGuesttwoVegan) {
            System.out.println("Here is the vegan menu for the vegan guest");
        } else {
            System.out.println("Here is the rest of the menu");
        }
        System.out.println();

        System.out.println("Homework Question #2");
        System.out.println();


        System.out.println("Homework Question #3");
        System.out.println();

        int number;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please select a number");
        String userSelection = scanner1.nextLine();
        number = Integer.parseInt(userSelection);
        if (number%15==0) {
            System.out.println("The number you selected is divisible by 15");
        } else {
            System.out.println("The remainder when you divide the two numbers are : " + number % 15);
            System.out.println();

            System.out.println("Homework Question 4");
            System.out.println();

            String myName = "Manzurul K. Rana";
            if (myName.length() > 8) {
                System.out.println(myName.replace('a', 'A'));
            } else System.out.println(myName.toUpperCase());
            System.out.println();

            System.out.println("Homework Question #5");
            System.out.println();



            System.out.println("Homework Question #6");
            System.out.println();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Welcome to the Kwik-E-Mart");
            System.out.println("What grocery item would you like to know information about?");
            String userInput = scanner2.nextLine();
            switch (userInput) {
                case "Milk":
                case "Eggs":
                case "Donuts":
                    System.out.println("Aisle Eight");
                    break;
                case "French Fries":
                case "Frozen Pizza":
                    System.out.println("Aisle Seven");
                    break;
                case "Candy":
                    System.out.println("Aisle Three");
                    break;
                case "Diapers":
                    System.out.println("Aisle One");
                    break;
                case "Apple":
                case "Orange":
                    System.out.println("Aisle Two");
                    break;
                default:
                    System.out.println("ERROR: You entered invalid item.");
            }
        }
    }
}
