class pattern10
{
	public static void main(String [] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=8;j!=0;j--)
			{
				if(j>8-i || j<=i)
				{
					System.out.printf(" *");
				}
				else
				{
					System.out.printf("  ");
				}
			}
			
			System.out.printf("\n");
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=8;j!=0;j--)
			{
				if(j>8-i || j<=i)
				{
					System.out.printf(" *");
				}
				else
				{
					System.out.printf("  ");
				}
			}
			
			System.out.printf("\n");
		}

	}
}