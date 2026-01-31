class pattern9
{
	public static void main(String [] args)
	{
	int i,j;
	for(i=1;i<=5;i++)
	{
		int k=i;
		for(j=1;j<=i;j++)
		{
			if(k%2==1)
			{
			System.out.printf(" 1");
			}		
			else
			System.out.printf(" 0");
			k++;
		}
		System.out.printf("\n");
	}
	}
}