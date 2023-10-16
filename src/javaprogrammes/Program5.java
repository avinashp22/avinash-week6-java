package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Program5 {
    //static method - no return with parameters
    public static void addition(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    //instance method - no return with parameters
    public void subtraction(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    //static method - no return with parameters
    public static void multiplication(int num1, int num2) {
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }

    //instance method - no return with parameters
    public void division(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter Number 1: "); //get input from user
        int num1 = scan.nextInt(); //save input from user
        System.out.println("Enter Number 2: "); //get input from user
        int num2 = scan.nextInt(); //save input from user
        // call methods into main method
        addition(num1, num2);
        multiplication(num1, num2);
        Program5 obj = new Program5();
        obj.subtraction(num1, num2);
        obj.division(num1, num2);
        scan.close(); //close scanner

    }
}
