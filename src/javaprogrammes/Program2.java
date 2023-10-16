package javaprogrammes;
/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {
    //Declare two static variables
    static int a = 5;
    static int b = 10;

    // Declare one static method
    public static void myMethod() {
        //Call both static variables into the static method inside the print statement.
        System.out.println(a);
        System.out.println(b);
    }

    //Declare the Main method.
    public static void main(String[] args) {
        //Call the static method into the Main method and Run the programme.
        myMethod();
    }

}
