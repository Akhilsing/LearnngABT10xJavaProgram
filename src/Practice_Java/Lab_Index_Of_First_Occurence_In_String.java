package Practice_Java;

import java.util.Scanner;

public class Lab_Index_Of_First_Occurence_In_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full length s1 String");	
		String s1= sc.nextLine().trim();
		System.out.println(s1);
		int len1=s1.length();
		System.out.println("Enter full length s2 String");	
		String s2= sc.nextLine().trim();
		System.out.println(s2);
		int len2=s2.length();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		boolean found=false;
		for(int i=0; i<=len1-len2; i++) {
			
			if(s1.charAt(i)==s2.charAt(0)) {
				
				if(s1.substring(i, len2+i).equals(s2)){
					System.out.println(i);
					found=true;
					break;
					
				}
				
			}
			} 
		
		if(!found) {
			System.out.println(-1);
			
		}
		
		sc.close();
	}

}
