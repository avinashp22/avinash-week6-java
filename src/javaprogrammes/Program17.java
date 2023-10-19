package javaprogrammes;
import java.util.Scanner;
/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter Decimal No "); //get input from user
        int b = scan.nextInt(); //save input from user
        String binary = Integer.toBinaryString(b); //converter
        System.out.println("Binary number is : " + binary); //print statement with result
        scan.close(); //close scanner
    }

}
