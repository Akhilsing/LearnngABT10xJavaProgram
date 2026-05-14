package Practice_Java;

public class Lab_Combine_Similar_Char_String {
	
	public static void main(String args[]) {
		
		String str="aabbcddrdddfhhikljjjfdggg";
		
		int leng=str.length()-1;
		
		int feq[]=new int[26];
		
		for(int i=0; i<leng; i++) {
			
			if(str.charAt(i)==str.charAt(i+1)) {
				
				char ch=str.charAt(i);
				int index= ch-'a' ;
				
				feq[index]=feq[index] + 1;
				
			}
			
		}
		
		for(int i=0; i<26; i++) {
			

					
			if(feq[i]>0) {
				char ch= (char)(i + 'a');
				//below one is not correct one
				//System.out.println(ch + ch + ": " + feq[i]);
				System.out.println("" + ch + ch + ": " + feq[i]);
			}
					
		}
		
	}

}
