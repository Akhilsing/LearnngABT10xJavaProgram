package Practice_Java;

/* this defines the class name as Lab_For_loop_P1, which
is the entry point to program
*/
public class Lab_For_Loop_P3 {
    // this is main method. program will execute from main method
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

