package Classwork;

import java.util.Arrays;

public class JavaMidterm {

    //Write a Java program to remove a specific element from an array.

    public String removeElement(int[] userArray, int removeIndex) {

        String message = "";

        System.out.println("Original Array: " + Arrays.toString(userArray));

        for(int i = removeIndex; i < userArray.length -1; i++) {

            userArray[i] = userArray[i];

        } message = "After removing the second element: "+ Arrays.toString(userArray); {

            return message;
        }
    }

    //Create a method to return missing smallest positive integer (greater than 0) from given array.

    public int missingInteger(int[] myArry) {

        int arrayLen = myArry.length;

        for (int i = 0; i < arrayLen; i++) {

            if (myArry[i] > 0 && myArry [i] <= arrayLen);
        }
        return arrayLen;
    }

    //Scenario: Traffic ticketing system
    public String licensePointCalculator(int speedLimit, int userSpeed) {

        int milesOver = userSpeed - speedLimit;
        int licensePoints = Math.floorDiv(milesOver,5);
        String message = "";

        if (licensePoints > 1 && licensePoints < 12) {
            message = "You have a total of " + licensePoints + " points.";
        } else if (licensePoints >= 12) {
            message = "You have reached: " + licensePoints + " points. Your license will be suspended.";
        }
        return message;
    }
}