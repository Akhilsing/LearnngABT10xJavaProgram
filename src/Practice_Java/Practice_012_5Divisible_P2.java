package Practice_Java;

//This line imports the Scanner class from the java.util package.
/*Scanner is used to read input from the user (like typing numbers
 from the keyboard).
 */
import java.util.Scanner;

//Q: Java Program to check given number is divisible by 5

/*this defines a class name as Practice_012_5Divisible_P2, which is
   the entry point of the program.
 */
public class Practice_012_5Divisible_P2 {

    //this is main method, the code will execute from main method
    public static void main(String[] args) {

        int number;


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
        //Reads an integer from the user and stores it in a.
        System.out.println("Enter a value ");
        number=sc.nextInt();

        if(number%5==0){
            System.out.println("it is divisible by 5");
        }
        else{
            System.out.println("it is not divisible by 5");
        }


    }
}


