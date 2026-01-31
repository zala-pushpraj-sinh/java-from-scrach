class pattern13
{
	public static void main(String [] args)
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=1;j--)
		{
			if(j<=i)
			{
			System.out.printf("%d",j);
			}
			else
			{
			System.out.printf(" ");
			}
		}
		for(int j=2;j<=5;j++)
		{
			if(j<=i)
			{
			System.out.printf("%d",j);
			}
			else
			{
			System.out.printf(" ");
			}
		}
		System.out.printf("\n");
	}
	}
}