package javaprogrammes;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    int a = 5;   // Declare one instance variable
    static int b = 10;  // Declare one static variable

    //Declare one instance method
    public void myMethod1() {
        //Call both instance and static variables into both instance and static methods inside the print statement
        System.out.println(a);
        System.out.println(b);
    }

    //Declare one static method
    public static void myMethod2() {
        //all both instance and static variables into both instance and static methods inside the print statement
        Program3 obj = new Program3();
        System.out.println(obj.a);
        System.out.println(b);
    }

    //Declare the Main method
    public static void main(String[] args) {
        //Call both instance and static methods into the Main method and run the programme
        Program3 obj = new Program3();
        obj.myMethod1();
        myMethod2();
    }
}
