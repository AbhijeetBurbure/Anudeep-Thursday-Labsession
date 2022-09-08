import java.util.*;
class PetersonNo
{
    public static void main(String args[])
    {
    	System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
     
        int a=b;
        int f=1,sum=0;
        while(b!=0)
        {
            f=1;
        
            int j=b%10;
   
            for(int i=1;i<=j;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            b=b/10;
        }
     
        if(sum==a)
        System.out.print(a+" is Peterson Number");
        else
        System.out.println(a+" is not Peterson Number");
    }
    }
