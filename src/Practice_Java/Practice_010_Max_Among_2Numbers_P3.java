package Practice_Java;


import java.util.Scanner;

/*This defines the class named Practice_010_Max_Among_2Numbers_P1, which is
 the entry point of the program.
 */
public class Practice_010_Max_Among_2Numbers_P3 {

    private static int LargestAmongTwo(int a, int b) {
        return (a>b) ? a:b;

    }


    // This is main method. the program execute from the main method
    public static void main(String[] args) {

        //Declare tree integers
        // a and b values store the input data from the user
        // largest to store the greatest number between and b
        int a, b, largest;

        //Scanner
        //A class from the java.util package.
        //Used to take input from the user (keyboard, file, etc.).
        //In this case, we’re using it to read input from the keyboard.

        //scan
        //This is the name of the object we’re creating.
        //You can name it anything, like input, scanner, or xyz, but here it's named scan.

        // =
        //The assignment operator.
        //Assigns the new Scanner object (on the right) to the variable scan (on the left).

        // new
        //A keyword in Java.
        //Used to create (instantiate) a new object.

        // Scanner(System.in)
        //This is the constructor of the Scanner class.
        //It creates a new Scanner object that takes input from System.in.

        // System.in
        //A standard input stream (usually the keyboard).
        //It is used by the Scanner to read input typed by the user.
        Scanner scan=new Scanner(System.in);

        //a
        //A variable (you must have declared it earlier as an int, like int a;).
        //It will store the number the user types.

        // =
        //Assignment operator — assigns the result of scan.nextInt() to a.

        // scan
        //The Scanner object we created earlier.

        // .
        //Dot operator — used to access methods or properties of an object.

        // nextInt()
        //A method of the Scanner class.
        //Reads the next integer input from the user (e.g., if the user types 42).
        //Prints a message asking the user to enter the a number.
        //Reads an integer from the user and stores it in a.
        System.out.println("Enter a value in integer ");
        a=scan.nextInt();

        //Prints a message asking the user to enter the b number.
        //Reads an integer from the user and stores it in ab.
        System.out.println("Enter b value in integer ");
        b=scan.nextInt();
        //System
        // A class in java.lang.package
        //it provide the access to system-level resources like input, output, and error streams.
        System.out.println("\nLargest number among two = " + LargestAmongTwo(a, b));

    }


}
