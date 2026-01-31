class pattern12
{
	public static void main(String []args)
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=1;j--)
		{
		if(j<=i)
		{
		System.out.printf(" %d",i);
		}
		else
		System.out.printf(" ");
		}
		System.out.printf("\n");
	}
	}
}