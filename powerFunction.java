import java.util.*;
public class powerFunction
{
    public static int power(int b,int p)
    {
        if(p==0)
        {
            return 1;
        }
        int ans=b*power(b,p-1);
        return ans;
    }
    public static void main(String[] args)
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
