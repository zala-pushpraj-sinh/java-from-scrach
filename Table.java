import java.util.*;
class Table
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter which table of sum  you need to print");
	int i=sc.nextInt();
	for(int n=1;n<11;n++)
	{
	System.out.printf("%d * %d=%d\n",i,n,(n*i)); 
	}
	sc.close();
	}
}