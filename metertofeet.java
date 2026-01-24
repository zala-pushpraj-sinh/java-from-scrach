import java.util.Scanner;
class metertofeet
{
	public static void main(String [] args)
{
	float a;
	System.out.println("Enter distance in meter");
	Scanner sc=new Scanner(System.in);
	a=sc.nextFloat();
	a=a*3.28084f;
	System.out.printf("Answer is : %.2f\n",a);
} 
}
