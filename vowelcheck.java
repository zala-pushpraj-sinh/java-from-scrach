import java.util.Scanner;
class vowelcheck
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter character to check");
	char ch=sc.next().charAt(0);
	ch=Character.toLowerCase(ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	System.out.println("Enter charecter is vowel");
	}
	else
	System.out.println("Enter character is cosonant");
	sc.close();
	}
}