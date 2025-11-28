package Practice_Java;

//This line imports the Scanner class from the java.util package.
/*Scanner is used to read input from the user (like typing numbers
 from the keyboard).
 */
import java.util.Scanner;
import java.util.SortedMap;

//Q2: Find largest/maximum using Math.max()

/*defined the class name as Practice_010_Max_Among_2Numbers_P2 from this main,
 which is the entry point of the program
 */
public class Practice_010_Max_Among_2Numbers_P2 {

    //This the main method from this main method program will execute
    public static void main(String[] args) {

        //Declare the three integers
        // a and b is the variables which stores the input from the user
        //largest to store the greater number between a and b.
        int a, b, largest;

        // created the object scan for scanner class and read the input from user
        Scanner scan = new Scanner(System.in);

        //Prints a message asking the user to enter the a number.
        //Reads an integer from the user and stores it in a.
        System.out.println("Enter a value in integer ");
        a=scan.nextInt();

        //Prints a message asking the user to enter the b number.
        //Reads an integer from the user and stores it in ab.
        System.out.println("Enter b value in integer ");
        b=scan.nextInt();

        // System
        //A class in the java.lang package.
        //It provides access to system-level resources like input, output, and error streams.

        //out
        //A static field in the System class.
        //It represents the standard output stream (typically the console).
        //It’s an object of PrintStream class.

        //println
        //A method of the PrintStream class.
        //It prints the argument passed to it and moves the cursor to the next line.

        //"\nLargest number among two = "
        //This is a string literal.
        //\n is an escape character that adds a newline before the text.
        //So the output 29starts from a new line and then prints "Largest number among two = ".

        // +
        //The string concatenation operator.
        //Joins the string with the result of Math.max(a, b).

        //Math
        //A class in the java.lang package.
        //Provides common mathematical functions, such as max, min, sqrt, etc.

        // max(a, b)
        //A static method of the Math class.
        //Takes two arguments and returns the greater (maximum) value between them.
        //Here, it compares variables a and b.

        System.out.println("\nLargest number among two = " +Math.max(a, b));


    }
}
// Find max number among 3
//You can nest Math.max() to compare more than 2 numbers:
//int max = Math.max(a, Math.max(b, c));