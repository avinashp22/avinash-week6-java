package javaprogrammes;
import java.util.Scanner;
/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Program6 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter Radius "); //get input from user
        double radius = scan.nextDouble(); //save input from user
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of Circle is " + area); //print statement with result
        scan.close(); //close scanner
    }

}
