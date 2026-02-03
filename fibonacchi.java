import java.util.*;
class fibonacchi
{
	public static void main(String [] args)
	{
		int a,b=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter how many steps to print:");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++)
		{
			System.out.println(b+" ");
			a=b+c;
			b=c;
			c=a;
			
		}
		sc.close();
	}
}