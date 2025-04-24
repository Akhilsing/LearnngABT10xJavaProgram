/*package	A keyword that defines the package (folder-like structure)
where the class belongs.
 */
//Practice_Java	The name of the package. Helps organize your code in projects.
package Practice_Java;

// Q: print 1 t0 100 number using Do while loop
/* this defines class name
 as Practice_015_While_Loop_P1, which
is the entry point to program
 */
public class Lab_016_Do_While_P1 {

    // this the main method, code will be execute from here
    public static void main(String[] args) {

        int i=1;

        do{
            System.out.println(i);
            i++;
        }
        /* while	A looping keyword. It repeats the code inside the block as long
         s the condition is true.
         */
        //( )-	Parentheses hold the condition for the loop.
        /* i <= 100	This is the condition. It means “loop will run as long as i
           is less than or equal to 100”.
         */
        while(i <=100);

            //🔹 System
            //A class in the java.lang package.
            //It provides access to system-level resources like input, output, and error streams.

            //🔹 out
            //A static field in the System class.
            //It represents the standard output stream (typically the console).
            //It’s an object of PrintStream class.

            //🔹 println
            //A method of the PrintStream class.
            //It prints the argument passed to it and moves the cursor to the next line.
            System.out.println(i);



    }

}
