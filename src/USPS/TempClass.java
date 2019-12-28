package USPS;
public class TempClass {
    public static void main(String[] args) {

        System.out.println("Temperature Conversion Homework 12/23");
        System.out.println();

        //Celsius to Kelvin
        double celsius = 40;
        double kelvin = (celsius + 273.15);
        System.out.println("The temperature in Kelvin is: " + kelvin);
        System.out.println();

        //Kelvin to Fahrenheit
        double kelvin2fahrenheit = (kelvin * 9/5 - 459.67);
        System.out.println("The temperature in Fahrenheit is: " + kelvin2fahrenheit);
        System.out.println();

        //Celsius to Fahrenheit
        Double celsius2fahrenheit = (celsius * 9/5 + 32);
        System.out.println("The temperature in Fahrenheit is: " + celsius2fahrenheit);
        System.out.println();

        //Kelvin to Celsius
        Double kelvin2celsius = (kelvin - 273.15);
        System.out.println("The temperature in Celsius is: " + kelvin2celsius);
        System.out.println();

        System.out.println("End of Homework");

    }
}