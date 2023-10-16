package javaprogrammes;
/**
 * Write a Java program to swap two variables.
 */
public class Program15 {
    // main method
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping a = " + a + " and b =" + b); //print statement with result
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After swapping a = " + a + " and b =" + b); //print statement with result

    }

}
