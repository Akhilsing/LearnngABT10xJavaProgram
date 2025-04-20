package Practice_Java;

//This line imports the Scanner class from the java.util package.
/*Scanner is used to read input from the user (like typing numbers
 from the keyboard).
 */
import java.util.Scanner;

//Q1:Program To Check given input is Digit or not in Java

/*This defines the class named Practice_010_Max_Among_2Numbers_P1, which is
 the entry point of the program.
 */
public class Practice_012_Digit_or_Not_P6 {

    //this is main method, the code will execute from main method
    public static void main(String[] args) {

        char ch;

        //Scanner
        // A class in java.util. package
        //it takes the input from the user

        //Sc
        // This is the name of the object is created

        //=
        //Assignment operator
        // Assigns the new Scanner object (on the right) to the variable sc (on the left).

        // new
        // this is a keyword in java
        // used to create new object

        //Scanner(System.in)
        //This is the constructor of the Scanner class.
        //It creates a new Scanner object that takes input from System.in.

        //System.in
        //A standard input stream (usually the keyboard).
        //It is used by the Scanner to read input typed by the user.

        //Creates a Scanner object named sc to read input from the keyboard (System.in).
        Scanner sc= new Scanner(System.in);

        //Prints a message asking the user to enter the a number.
        //Reads an char from the user and stores it in ch.
        System.out.println("Enter a value ");
        ch=sc.nextLine().charAt(0);

        if(ch>='0' && ch<='9'){
            System.out.println("Given input is Digit");
        }

        else {
            System.out.println("Given input is not Digit");
        }



    }
}

