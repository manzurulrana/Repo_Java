package Classwork;

import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {

System.out.println("Homework Question #1");
System.out.println();

        int totalCorrect;
        int totalQuestions;

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many questions were on the exam?");
        totalQuestions = userInput.nextInt();
        System.out.println("How many questions did the student get correct?");
        totalCorrect = userInput.nextInt();
        double percentage = (totalCorrect * 100 / totalQuestions);

        if (percentage > 90 && percentage <= 100) {
            System.out.println("You got an: A");
        } else if (percentage > 80 && percentage <= 89) {
            System.out.println("You got an: B");
        } else if (percentage > 70 && percentage <= 79) {
            System.out.println("You got an: C");
        } else if (percentage > 60 && percentage <= 69) {
            System.out.println("You got an: D");
        } else if (percentage > 0 && percentage <= 59) {
            System.out.println("You got an: F");
            System.out.println();

System.out.println("Homework Question #2");
System.out.println();

            Scanner scan1 = new Scanner(System.in);
            System.out.println("Please enter a number");
            int userNumber = scan1.nextInt();
            System.out.println("What number do you want the multiplication table up to?");
            int maxNumber = scan1.nextInt();

            System.out.println("Multiplication table for: " + userNumber);
            System.out.println();

            for (int i = 0; i <= maxNumber; i++) {
                System.out.println(userNumber + " x " + (i) + " = " + (userNumber * i));

//3. Write a logic that checks if a number is a Prime number
System.out.println("Homework Question #3");
System.out.println();

                int inputNumber;
                boolean truePrime = true;

                System.out.println("Enter a number");
                Scanner primeNumber = new Scanner(System.in);
                inputNumber = primeNumber.nextInt();

                for (int x = 2; x <= Math.sqrt(inputNumber); x++) {
                    if (inputNumber % x == 0) {

                        truePrime = false;
                        break;
                    }

                } if (truePrime == true) {
                    System.out.println(inputNumber + " is a prime number.");
                } else  {
                    System.out.println(inputNumber + " is not a prime number");

                    }
                }
            }
        }
    }