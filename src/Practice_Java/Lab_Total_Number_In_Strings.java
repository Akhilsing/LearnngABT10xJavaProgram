package Practice_Java;

import java.util.Scanner;

public class Lab_Total_Number_In_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter full length  String");	
			String s= sc.nextLine().trim().toLowerCase();
			System.out.println(s);
			int len1=s.length();
			int count =0;
			for(int i=0; i<len1; i++) {
				if(s.charAt(i)!=' ') {
					count++;
					
				}
				}
					
				System.out.println(count);
	}

}
