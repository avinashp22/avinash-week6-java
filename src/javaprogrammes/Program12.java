package javaprogrammes;
/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Program12 {
    // main method
    public static void main(String[] args) {
        //variables with values
        double a = 25.5;
        double b = 3.5;
        double c = 3.5;
        double d = 3.5;
        double e = 40.5;
        double f = 4.5;
        double ans = ((a * b - c * d) / (e - f));
        System.out.println(ans); //print statement with result

    }

}
