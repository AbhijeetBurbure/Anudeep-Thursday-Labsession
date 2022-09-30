import java.util.Scanner;
public class NoOfCoins  
{
	static int ways(int[] coins, int sum) 
	{
	   
			int l=coins.length;
	    	int[][] arr = new int[l + 1][sum + 1];
	    	
	  
	    	for(int i = 0; i < l + 1; i++)
	    		arr[i][0] = 1;
	    	
	  
	    	for(int i = 1; i < l + 1; i++)
	    		for(int j = 0; j < sum + 1; j++)
	    			if(coins[i - 1] > j)
	    				arr[i][j] = arr[i - 1][j];
	    			else  
	    				arr[i][j] = arr[i][j - coins[i - 1]] + arr[i - 1][j];
	    	
	    	return arr[l][sum];
	}
	public static void main(String[]args)
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Type the total number of elements you want to Inculde:");
			int n =sc.nextInt();
			System.out.println("Type the sum you want from the number of elements:");
			int sum=sc.nextInt();
			int coins[]=new int[n];
			System.out.println("Type the number of elements you want to include in a set:");
			for(int i=0;i<n;i++)
			{
				coins[i]=sc.nextInt();
			}
			System.out.println("The elements you have given are:");
			for(int i=0;i<n;i++)
				
			{
				System.out.print("{"+(+ (coins[i])+"}"));	
			}
			
			System.out.println("");
			System.out.println("Number of ways in which sum " + sum
					+ " can be made using the given set of elements is "+ ways(coins, sum));
		}
	}

	
}


