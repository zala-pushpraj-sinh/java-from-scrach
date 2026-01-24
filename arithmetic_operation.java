import java.util.Scanner;
class arithmetic_operation
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first and second element");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter 1.Sum \n2.Substractor \n3.Multipllaction \n4.Division");
	int c=sc.nextInt();
	if(c==1)
		{
		int d=a+b;
		System.out.println("sum is="+d);
		}
	if(c==2)
		{
		int d=a-b;
		System.out.println("sub is="+d);
		}
	if(c==3)
		{
		int d=a*b;
		System.out.println("mul is="+d);
		}
	if(c==4)
		{
		float d=(float)a/b;
		System.out.printf("div is=%.2f\n",d);
		}
	}
}
