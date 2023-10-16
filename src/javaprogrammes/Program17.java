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
        String b = scan.next(); //save input from user
        int b1 = Integer.parseInt(b, 2);
        String binary = Integer.toBinaryString(b1); //converter
        System.out.println("Binary number is : " + binary); //print statement with result
        scan.close(); //close scanner
    }

}
