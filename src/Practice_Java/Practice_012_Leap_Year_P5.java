package Practice_Java;

//This line imports the Scanner class from the java.util package.
/*Scanner is used to read input from the user (like typing numbers
 from the keyboard).
 */
import java.util.Scanner;

//Q: Java Program to check given year is leap year or not

/*this defines a class name as Practice_012_5Divisible_P2, which is
   the entry point of the program.
 */
public class Practice_012_Leap_Year_P5 {
    //this is main method, the code will execute from main method
    public static void main(String[] args) {

        int year;

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
        //Reads an integer from the user and stores it in year.
        System.out.println("Enter a value ");
        year=sc.nextInt();

        if(year%400==0){
            System.out.println("Given " + year + " is Leap Year");
        }
        else if(year%100==0){
            System.out.println("Given " + year + " is not Leap Year");
        }
        else if(year%4==0){
            System.out.println("Given " + year + " is Leap Year");
        }
        else {
            System.out.println("Given " + year + " is not Leap Year");
        }



    }
}


