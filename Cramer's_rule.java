import java.util.Scanner;
class Cramer's_ruel
{
	public static void main(String [] args)
{
	int a,b,c,d,e,f,D;
	System.out.println("Enter Cofficinets of two linear eqn");
	System.out.println("ax+by=e \ncx+dy=f");
	System.out.println("Enter values of a,b,c,d,e,f");
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	e=sc.nextInt();
	f=sc.nextInt();
	D=(a*d)-(b*c);
	int Dx=(e*d)-(b*f);

	int Dy=(a*f)-(c*e);
	float x=(float)Dx/D;
	float y=(float)Dy/D;
	if (D!=0)
	{
	System.out.println("x="+x);
	System.out.println("y="+y);
	}	
	else if (D==0 && Dx==0 && Dy==0)
	{
	System.out.println("Both line are on each other soo we get Infinite solutions");
	}
	else 
	System.out.println("Both line are parellel to each other so we get no solutions");
	sc.close();
}
}
