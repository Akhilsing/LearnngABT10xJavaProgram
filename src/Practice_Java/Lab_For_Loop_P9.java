package Practice_Java;

/* this defines the class name as Lab_For_loop_P1, which
        is the entry point to program
*/
public class Lab_For_Loop_P9 {

    // this is main method. program will execute from main method
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
}
