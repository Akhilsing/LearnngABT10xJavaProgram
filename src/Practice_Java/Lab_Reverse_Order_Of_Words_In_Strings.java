package Practice_Java;

import java.util.Scanner;

public class Lab_Reverse_Order_Of_Words_In_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full length  String");	
		String s= sc.nextLine().trim();
		System.out.println(s);
		int len1=s.length();
		String rev= "";
		//create the array
		
		String[] words=s.split(" ");
		int len2=words.length;
		
		
		for (int i=len2-1; i>=0; i--) {
			rev= rev+words[i]+ " ";
		}
		System.out.println(rev.trim());
		sc.close();

	}

}
