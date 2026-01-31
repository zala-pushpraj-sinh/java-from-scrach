class  pattern8
{
	public static void main(String [] args)
	{
		int  j=0;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				j++;
				System.out.printf(" %d",j);	
			}
			System.out.printf("\n");
		}
	}
}