package javaprogrammes;
import java.util.Scanner;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter First Number "); //get input from user
        int a = scan.nextInt(); //save input from user
        System.out.println("Enter Second Number "); //get input from user
        int b = scan.nextInt(); //save input from user

        //formula result is variable
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        //print statement with result
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " X " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + mod);
        scan.close(); //close scanner

    }

}
