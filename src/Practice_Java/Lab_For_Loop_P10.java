package Practice_Java;

/* this defines the class name as Lab_For_loop_P1, which
        is the entry point to program
*/
public class Lab_For_Loop_P10 {
    // this is main method. program will execute from main method
    public static void main(String[] args) {
        int n = 5;
        //Upper star
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces print
            int spaces= 2 * (n-i);
            for (int j = 1 ; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        //below stars
        for (int i = n; i >= 1; i--) {

            //This is the inner loop that prints * stars on the left side of that row.
            //The number of stars printed depends on the value of i.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces print
            int spaces= 2 * (n-i);
            for (int j = 1 ; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}
