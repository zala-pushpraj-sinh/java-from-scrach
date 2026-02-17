import java.util.*;
public class Factorial {
    public static long factorial(int num)
    {
        if(num==1 || num==0)
        {
            return 1;
        }
        long fact= num * factorial(num-1);
        return fact;
    }
    public static void main(String [] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        num=sc.nextInt();
        long fact=factorial(num);
        System.out.printf("Factorial of %d is=%d",num,fact);
        sc.close();
    }
}
