package javaprogrammes;
import java.util.Scanner;
/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter Height "); //get input from user
        double height = scan.nextDouble();  //save input from user
        System.out.println("Enter Width "); //get input from user
        double width = scan.nextDouble(); //save input from user
        double area = height * width;
        double peri = (2 * (height + width));
        System.out.println("Area is " + height + " * " + width + " = " + area); //print statement with result
        System.out.println("Perimeter is 2 * " + "(" + height + "+" + width + ") = " + peri); //print statement with result
        scan.close(); //close scanner

    }

}
