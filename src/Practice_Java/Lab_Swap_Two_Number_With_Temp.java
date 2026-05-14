package Practice_Java;

import java.util.Scanner;

/*
  int a= 10, b=45;
  int temp;
  
 
  
   temp=a -----10
  a=b----- 45
  b=temp----10
  
 */

public class Lab_Swap_Two_Number_With_Temp {
	
	public static void main(String[] aregs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		System.out.println("Enter b number");
		int b=sc.nextInt();
		
		int temp;
		
		System.out.println("Start swaping two numbers with temp variable");
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap a is " + a);
		System.out.println("After swap b is " + b);
		
	}

}
