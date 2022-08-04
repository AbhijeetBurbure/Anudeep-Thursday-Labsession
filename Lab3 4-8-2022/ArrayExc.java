import java.util.Scanner;
class ArrayExc
{
	 public static void main (String[] ar)
	{	int temp;
		int ex[]=new int[5];
		System.out.println("Enter the nnumber:");
		Scanner s=new Scanner(System.in);
		for (int i=0; i<ex.length;i++)
		{
			ex[i]=s.nextInt();
		}
		System.out.println("The descending order is:");
		for(int i=0; i<ex.length;i++)
		{ 
			for (int j = i + 1; j < ex.length; j++)   
			{  
				if (ex[i] < ex[j])   
				{  
					temp = ex[i];  
					ex[i] = ex[j];  
					ex[j] = temp;  
				}  
			}  
 		{
			 System.out.println(ex[i]);
		}
		}
		System.out.println("The Assending order is:");
		for(int i=0; i<ex.length;i++)
		{
			for (int j = i + 1; j < ex.length; j++)   
			{  
				if (ex[i] > ex[j])   
				{  
					temp = ex[i];  
					ex[i] = ex[j];  
					ex[j] = temp;  
				}  
			}  
 		{ 
			System.out.println(ex[i]);
		}
		}

	}
}