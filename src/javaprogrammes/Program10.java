package javaprogrammes;
import java.util.Scanner;
/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * 8 x 10 = 80
 */
public class Program10 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter Number "); //get input from user
        int a = scan.nextInt();//save input from user
        System.out.println(a + " x 1 = " + a * 1); //print statement with result
        System.out.println(a + " x 2 = " + a * 2);
        System.out.println(a + " x 3 = " + a * 3);
        System.out.println(a + " x 4 = " + a * 4);
        System.out.println(a + " x 5 = " + a * 5);
        System.out.println(a + " x 6 = " + a * 6);
        System.out.println(a + " x 7 = " + a * 7);
        System.out.println(a + " x 8 = " + a * 8);
        System.out.println(a + " x 9 = " + a * 9);
        System.out.println(a + " x 10 = " + a * 10);
        scan.close(); //close scanner

    }

}
