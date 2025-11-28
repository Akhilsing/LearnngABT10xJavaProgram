package Practice_Java;

import java.util.Scanner;

public class Practice_019_Count_Digits {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        while(n>0){

            int r= n%10;
            n=n/10;
            count++;

        }
        System.out.println(count);
    }
}
