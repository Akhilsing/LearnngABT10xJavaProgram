package Practice_Java;

import java.util.Scanner;

public class Lab_Reverse_String {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Actual the String :" + str);
		int length= str.length();
		String rev="";
		
		for(int i=length-1; i>=0; i--)
		{
			
		rev=rev + str.charAt(i);
		
		}
		System.out.println("Reverse the String :" + rev);
	}

}
