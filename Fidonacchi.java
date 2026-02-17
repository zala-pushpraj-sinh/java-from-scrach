import java.util.*;
public class Fidonacchi
{
    public static void fibo(int a, int b,int num)
    {
        if(num==0)
        {
            return;
        }
        int c= a+b;
        System.out.println(c);
        fibo(b,c,num-1);
    }
    public static void main(String [] args)
    {
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms to print:");
        int term=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,term-2);
        sc.close();
    }
}
