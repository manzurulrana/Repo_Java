package Classwork;

import java.util.Scanner;

public class loginPage {
    public static void main(String[] args) {

        String inputID;
        String actualUserID = "rana";
        String inputPassword;
        String actualPassword = "rana";

        Scanner newScan = new Scanner(System.in);

        //Tell user to enter username
        System.out.println("Please enter your username");
        inputID = newScan.nextLine();
        //Tell user to enter password
        System.out.println("Please enter your password");
        inputPassword = newScan.nextLine();

        for(int i=1; i <6; i++){

            int remaining = 5-i;

            if ((!actualPassword.equals(inputPassword) || !actualUserID.equals(inputID)) && (remaining != 0 )){

                //printing out error message for invalid inputs
                System.out.println("Please try your credentials again");

                //Notifying user of remaining attempts
                System.out.println("You have " + remaining + " attempts left");

                //Entering login information again
                System.out.println("Please Enter your userid again");
                inputID = newScan.nextLine();
                System.out.println("Please enter your password again.");
                inputPassword = newScan.nextLine();

            }else if ((remaining == 0) && (!actualPassword.equals(inputPassword) || !actualUserID.equals(inputID))){
                System.out.println("Maximum attempts reached, your account will be locked for 10 minutes.");
            }
            else{
                System.out.println("Welcome to the homepage!!");
                break;
            }
        }
    }
}

