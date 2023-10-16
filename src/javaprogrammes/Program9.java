package javaprogrammes;
import java.util.Scanner;
/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9 {
    // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner object
        System.out.println("Enter UPPER CASE WORD"); //get input from user
        String upper = scan.nextLine(); //save input from user
        System.out.println(upper.toLowerCase()); //print statement with result
        scan.close(); //close scanner

    }

}
