package Practice_Java;

import java.util.Scanner;

public class Practice_021_Power_Of_Number {
    public static void main(String[] args) {
        int n, p, result=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n= sc.nextInt();

        System.out.println("Enter the power");
        p=sc.nextInt();
        
        for(int i=1; i<=p; i++){
            result=result * n;
        }
        System.out.println(result);
    }
}
