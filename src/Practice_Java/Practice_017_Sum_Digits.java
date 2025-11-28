package Practice_Java;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Practice_017_Sum_Digits {

    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        while(n>0){
            int r= n % 10;
            sum = sum + r;
            n= n/10;
        }
        System.out.println("total value:" + sum);



    }
}
