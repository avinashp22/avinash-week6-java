package javaprogrammes;
/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {
    //Declare two instance variables
    int a = 5;
    int b = 10;

    //Declare one instance method
    public void myMethod() {
        //Call both instance variables into the instance method inside the print statement
        System.out.println(a);
        System.out.println(b);
    }

    //Declare the Main method
    public static void main(String[] args) {
        //Call the above instance method into the Main method and Run the programme
        Program1 obj = new Program1();
        obj.myMethod();
    }

}
