package javaprogrammes;
import java.util.Scanner;
/**
 * *Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter Fahrenheit Temp  "); //get input from user
        double f = scan.nextDouble(); //save input from user
        System.out.println("Temperature in Celsius is " + ((f - 32) * 5 / 9)); //print statement with result
        scan.close(); //close scanner
    }

}
