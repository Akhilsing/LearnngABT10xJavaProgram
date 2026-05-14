package Practice_Java;

import java.util.Scanner;

/* Logic:
  int a=40, b=50;
  
  a=a+b-----40+50---90
  b=a-b----90-50-----40
  a=a-b----90-40---50
  
 */

public class Lab_Swap_Two_Numbers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		System.out.println("Enter b number");
		int b=sc.nextInt();
		
		
		System.out.println("Start swaping two numbers with temp variable");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap a is " + a);
		System.out.println("After swap b is " + b);
	}

}
