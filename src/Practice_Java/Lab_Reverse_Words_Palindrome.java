package Practice_Java;

import java.util.Scanner;

public class Lab_Reverse_Words_Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter full length  String");	
	String s= sc.nextLine().trim().toLowerCase();
	System.out.println(s);
	int len1=s.length();
	String rev= "";
	for(int i=len1-1; i>=0; i--) {
		rev= rev+s.charAt(i);
		
	}
	if(s.toLowerCase().equals(rev.toLowerCase())) {
		System.out.println("It is a Palindrome");
	}else {
		System.out.println("It is not a Palindrome");
	}
	sc.close();
	
	}
	

}

