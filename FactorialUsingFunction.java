import java.util.*;
class FactorialUsingFunction
{
	public static int factorial (int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
		fact=fact*i;
		}
		return fact;
	}
	public static void main (String [] args)
	{
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.printf("Enter num  to find its factorial:");
		num=sc.nextInt();
		int fact=factorial(num);
		System.out.println("Factorial of "+num+" is:"+fact);
		sc.close();
	}
}