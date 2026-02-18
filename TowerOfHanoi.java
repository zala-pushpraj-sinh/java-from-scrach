import java.util.*;
public class TowerOfHanoi
{
    public static void change(int n, String source,String help,String destination)
    {
        if(n==1)
        {
            System.out.println("Disk "+n+" transfer from "+source+" to "+destination);
            return ;
        }
        change(n-1,source,destination,help);
        System.out.println("Disk "+n+" transfer from "+source+" to "+destination);
        change(n-1,help,source,destination);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disk:");
        int num= sc.nextInt();
        change(num, "S", "H", "D");
        sc.close();
    }
}
