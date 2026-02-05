package Practice_Java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab_Reverse_Words_In_String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter full length  String");	
			String s= sc.nextLine();
			s=s.trim();
			int len1=s.length();
			char last = s.charAt(len1-1);
			
			if(last=='.'|| last=='?' || last=='!') {
				System.out.println("Invalid Senteence");
				return;
			}
			s=s.toUpperCase();
			s=s.trim();
			StringTokenizer st= new StringTokenizer(s, " .?!");
			while(st.hasMoreTokens()) {
				String word = st.nextToken(); // get each word

	            // Reverse the word using for loop
	            String rev = "";
	            for (int i = word.length() - 1; i >= 0; i--) {
	                rev += word.charAt(i);
	            }	
			
			if(word.toLowerCase().equals(rev.toLowerCase())) {
				System.out.println(word + "It is a Palindrome");
			}else {
				System.out.println(word +"It is not a Palindrome");
			}
			
			}
			sc.close();
	}

}
