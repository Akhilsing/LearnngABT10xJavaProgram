package Practice_Java;

import java.util.Scanner;


public class Lab_String_Length_Of_Last_Word {
	/*
	 * take the input from user and find the last word count
	 * user the scanner class object and get the input from user
	 * use the nextLine  method for long string
	 * if there any unnecessary extra spaces the trim method will remove those spaces
	 * get the length of string
	 * initialize the count is zero
	 * 'user the for loop from last to first
	 * user if condition inside the for loop
	 * if condition if there is no space increases the count or else break
	 * at last print the count
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full length String");	
		String s= sc.nextLine().trim();
		int leng=s.length();
		int count = 0;
		
		for(int i= leng-1; i>=0; i--) {
			 if (s.charAt(i)!=' ') {
				 count ++;
				 
			 }else {
				 break; 
			 }
				 
		}
		System.out.println("Total count of Last Word " + count);
		

		
		
	}

}
