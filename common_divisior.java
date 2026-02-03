import java.util.*;
	
class common_divisior
{
	public static void main(String [] args)
	{
		int fin=0;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter 2 elements:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i ==0 && b%i==0)
				{
					fin=i;
				}
			}
			System.out.println("biggest common divisor is:"+fin);
		}
		else
		{
			for(int i=1;i<=b;i++)
			{
				if(a%i ==0 && b%i==0)
				{
					fin=i;
				}
			}
			System.out.println("biggest common divisor is:"+fin);
		}
		sc.close();
	}
}