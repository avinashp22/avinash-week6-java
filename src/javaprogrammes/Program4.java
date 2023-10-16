package javaprogrammes;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    //Declare two instance
    int a = 1;
    String firstname = "Avi";
    // and two static variables
    static int b = 2;
    static String lastname = "Patel";

    //Declare one instance method
    public void myMethod1() {
        //Call all four instance and static variables into both instance and static methods inside the print statement
        System.out.println(a);
        System.out.println(firstname);
        System.out.println(b);
        System.out.println(lastname);
    }

    //Declare one static method
    public static void myMethod2() {
        ////Call all four instance and static variables into both instance and static methods inside the print statement
        Program4 obj = new Program4();
        System.out.println(obj.a);
        System.out.println(b);
        System.out.println(obj.firstname);
        System.out.println(lastname);
    }

    //Declare the Main method
    public static void main(String[] args) {
        //Call both instance and static methods into the Main method and run the programme
        Program4 obj = new Program4();
        obj.myMethod1();
        myMethod2();
    }
}
