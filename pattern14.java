class pattern14
{
	public static void main(String [] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.printf(" ");
			}
			for(int j=1;j<2*i;j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.printf(" ");
			}
			for(int j=1;j<2*i;j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
}