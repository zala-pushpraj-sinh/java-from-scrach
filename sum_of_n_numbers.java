import java.util.*;

class sum_of_n_numbers
{
	public static void main (String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to sum");
	int n=sc.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++)
	{
	sum=sum+i;
	}
	System.out.printf("Sum of first %d number is:%d\n",n,sum);
	sc.close();
	}	
}