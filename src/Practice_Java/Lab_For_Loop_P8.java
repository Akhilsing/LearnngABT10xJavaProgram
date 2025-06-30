package Practice_Java;
/*
The pattern you've posted is a number triangle(Floyd's Triangle), where:
Each row contains one more number than the previous row.
The numbers increase sequentially from 1 onward.
 */
/* this defines the class name as Lab_For_loop_P1, which
is the entry point to program
*/
public class Lab_For_Loop_P8 {
    // this is main method. program will execute from main method
    public static void main(String[] args) {
    int n=6;
    int number=1;
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(number+ " ");
            number++;
        }
        System.out.println(" ");
    }
}
}
