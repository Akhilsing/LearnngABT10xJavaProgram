package Practice_Java;

import java.util.Scanner;

public class Practice_022_Sum_Of_Even_Odd_numbers {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();


        if(n%2==0){
            for(int i=0; i<=n; i=i+2){

                sum=sum+i;
            }
            System.out.println(sum);
        }
        else {
            for (int i = 1; i <= n; i = i + 2) {
                sum = sum + i;
                System.out.println(sum);
            }
            System.out.println(sum);
        }

    }
}
