package javaprogrammes;
import java.util.Scanner;
/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter Base Length "); //get input from user
        double b = scan.nextDouble();//save input from user
        System.out.println("Enter Triangle Height "); //get input from user
        double h = scan.nextDouble(); //save input from user
        double area = ((b * h) / 2);
        System.out.println("Area of Triangle is " + area); //print statement with result
        scan.close(); //close scanner

    }

}
