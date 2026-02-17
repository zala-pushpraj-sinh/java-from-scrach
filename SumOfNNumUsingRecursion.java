import java.util.*;

class SumOfNNumUsingRecursion
{
    public static int SumUsingRecursion(int n)
    {

        if(n==0)
        {
            return 0;
        }
        int sum= n+ SumUsingRecursion(n-1);
        return sum;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num= sc.nextInt();
        sc.close();
        int sum=SumUsingRecursion(num);
        System.out.printf("Sum of first %d num is:%d",num,sum);
    }
}