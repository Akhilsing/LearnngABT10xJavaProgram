package Practice_Java;

import java.util.Scanner;

public class Lab_First_letter_In_Captial_with_Full_Stop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full length  String");	
		String s= sc.nextLine();
		System.out.println(s + " "+ s.length());
		s=s.trim();
		s=" " + s;
		System.out.println(s + " "+ s.length());
		int len1=s.length();
		String funct =" ";
		sc.close();
		for(int i=0; i<len1; i++) {
			
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				
				funct=funct + Character.toUpperCase(s.charAt(++i)) + ".";
				
			}
		}
		System.out.println(funct.trim());

	}
	

}
