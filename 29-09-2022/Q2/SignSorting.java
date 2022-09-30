import java.util.Scanner;

public class SignSorting 
{
	  static void Elements(int arr[], int n) 
	  { 
		  int a[] = new int[n]; 
		  int j = 0; 
	          
	      for (int i = 0; i < n; i++) 
	    	  	if (arr[i] >= 0) 
	                a[j++] = arr[i]; 
	   
	      		if (j == n || j == 0) 
	            return; 
	  
	      for (int i = 0; i < n; i++) 
	            if (arr[i] < 0) 
	                a[j++] = arr[i]; 

	        for (int i = 0; i < n; i++) 
	           arr[i] = a[i]; 
	   } 
    public static void main(String arg[]) 
    { 
    	try (Scanner sc = new Scanner(System.in)) 
    	{
			System.out.println("Total Number of elements you want to input:");
			int n =sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the numbers you want to input:");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Number of elements you have given are:");
			for(int i=0;i<n;i++)
			{
			
				System.out.print(arr[i]+" ");
				
			}
  
			Elements(arr, n);
			System.out.println("  ");
			System.out.println(" ********************************************************************************* ");
			System.out.print("The sorted positive and negative elements are:");
			for (int i = 0; i < n; i++) 
				
			    System.out.print(arr[i] + " ");
		} 
    } 
  

}
