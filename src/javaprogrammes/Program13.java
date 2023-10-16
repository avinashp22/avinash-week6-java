package javaprogrammes;
import java.util.Scanner;
/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Program13 {

    public static void main(String[] args) {
// main method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number "); //get input from user
        int value1 = scan.nextInt(); //save input from user
        System.out.println("Enter Second Number "); //get input from user
        int value2 = scan.nextInt(); //save input from user
        System.out.println("Enter Third Number "); //get input from user
        int value3 = scan.nextInt(); //save input from user
        System.out.println("Average Value is " + ((value1 + value2 + value3) / 3));  //print statement with result
        scan.close(); //close scanner

    }

}
