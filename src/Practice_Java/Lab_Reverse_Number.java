package Practice_Java;

import java.util.Scanner;

public class Lab_Reverse_Number {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= sc.nextInt();
		System.out.println("actual number : "+ number);
		int rev=0;
		 while(number!=0)
		 {
			 int num= number%10;
			
			 rev= rev * 10 + num;
			
			 number = number / 10;
			
			 
		 }
		 System.out.println("reverse number : "+ rev);
		 
		
	}

}
