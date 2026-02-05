package Practice_Java;

public class Lab_Sort_Array_Desc_Without_sorted {
	public static void main (String[] args)
	{
		int arr[]= {5,1,2,8,9,6};
		int len= arr.length;
		System.out.println(len);
		
		for(int i=0; i<len-1; i++) {
			for(int j=i+1; j<len; j++) {
				
				if(arr[i]<arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
					
				}
			}
		}
		// Print using NORMAL for loop
        System.out.println("Sorted Array (Descending):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	
		
        
		
	}
}
