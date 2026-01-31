class pattern11
{
	public static void main(String [] args)
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=5+1-i;j!=0;j--)
		{
			System.out.printf("  ");
		}
		for(int k=5;k!=0;k--)
		{
			System.out.printf(" *");

		}
		for(int l=1;l<=i;l++)
		{
			System.out.printf("  ");
		}
		System.out.printf("\n");

	}
	}
}