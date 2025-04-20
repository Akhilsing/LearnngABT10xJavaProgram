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

public class Practice_011_Max_Among_3Numbers_P4 {

    // This is the main() method, where the execution of the program begins.
    public static void main(String[] args) {

        //Declares three integer variables.
        //a, b and c to store the numbers input by the user.
        int a, b, c;

        //Creates a Scanner object named sc to read input from the keyboard (System.in).
        Scanner sc= new Scanner(System.in);

        //Prints a message asking the user to enter the a number.
        //Reads an integer from the user and stores it in a.
        System.out.println("Enter a value in integer ");
        a=sc.nextInt();

        //Prints a message asking the user to enter the b number.
        //Reads an integer from the user and stores it in b.
        System.out.println("Enter b value in integer ");
        b=sc.nextInt();

        //Prints a message asking the user to enter the c number.
        //Reads an integer from the user and stores it in c.
        System.out.println("Enter c value in integer ");
        c=sc.nextInt();

        //Compares the two numbers:
        //If a is greater then b and c then it prints a
        if(a>b & a>c) {
            System.out.println("Maximum number a is:"+a);
        }
        //This block runs only if the first if is false.
        //Now, it checks if b is greater than c.
        //If true, then b is the maximum.
        else if (b>c) {
            System.out.println("Maximum number b is:" + b);
        }
        //above conditions false then c prints
        else {
            System.out.println("Maximum number c is:"+c);


        }

    }
}



