package Practice_Java;

//This line imports the Scanner class from the java.util package.
/*Scanner is used to read input from the user (like typing numbers
 from the keyboard).
 */
import java.util.Scanner;

//Q1:Java Program to print maximum among two numbers using if else

/*This defines the class named Practice_010_Max_Among_2Numbers_P1, which is
 the entry point of the program.
 */
public class Practice_010_Max_Among_2Numbers_P1 {

   // This is the main() method, where the execution of the program begins.
    public static void main(String[] args) {

       //Declares three integer variables.
        //a and b to store the numbers input by the user.
        //largest to store the greater number between a and b.
        int a, b, largest;

        //Creates a Scanner object named sc to read input from the keyboard (System.in).
        Scanner sc= new Scanner(System.in);

        //Prints a message asking the user to enter the a number.
        //Reads an integer from the user and stores it in a.
        System.out.println("Enter a value in integer ");
        a=sc.nextInt();

        //Prints a message asking the user to enter the b number.
        //Reads an integer from the user and stores it in ab.
        System.out.println("Enter b value in integer ");
        b=sc.nextInt();

        //Compares the two numbers:
        //If num1 is greater, it assigns num1 to largest.
        //Otherwise, it assigns num2 to largest
        if(a>b) {
            largest = a;
        }
        else {
                largest= b;

                //Prints the result — the largest number between the two inputs.
                System.out.println("largest number among two numbers is " + largest);

        //int MAX=(a>b) ? a:b;

        // int Max= (a>b) ? (a>c? a:c) : (b>c ? b:c);


        }

    }
}
