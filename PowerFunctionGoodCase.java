import java.util.*;
public class PowerFunctionGoodCase
{
    public static int power(int base,int pow)
    {
        if(pow ==0)
        {
            return 1;
        }
        if(pow%2==0)
        {
            int ans = power(base, pow / 2) *power(base, pow / 2) ;
            return ans;
        }
        else
        {
            int ans=base* power(base,pow/2) *power(base,pow/2);
            return ans;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base number:");
        int base= sc.nextInt();
        System.out.print("Enter power:");
        int pow=sc.nextInt();
        int ans=power(base,pow);
        System.out.printf("%d^%d=%d",base,pow,ans);
        sc.close();
    }
}
