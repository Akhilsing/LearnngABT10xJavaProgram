package Practice_Java;

import java.util.Scanner;

public class Practice_018_Factor_Of_Number {

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }

    }
}
