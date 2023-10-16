package javaprogrammes;
import java.util.Scanner;
/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output
 * Sum of two binary numbers: 101
 */
public class Program16 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter First Binary No "); //get input from user
        String b = scan.next(); //save input from user
        System.out.println("Enter Second Binary No "); //get input from user
        String h = scan.next(); //save input from user
        int b1 = Integer.parseInt(b, 2);
        int h1 = Integer.parseInt(h, 2);
        int sum = b1 + h1;  //Sum of two binary numbers: 101
        String binary = Integer.toBinaryString(sum); //convert values
        System.out.println("Sum of two binary numbers: " + binary); //print statement with result
        scan.close(); //close scanner
    }

}
