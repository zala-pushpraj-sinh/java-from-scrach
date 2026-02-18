import java.util.*;
public class revStr
{
    public static void revStr(String str,int len)
    {
        if(len <0)
        {
            return ;
        }
        System.out.print(str.charAt(len));
        revStr(str,len-1);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter string:");
        String word= sc.nextLine();
        revStr(word,word.length()-1);
    }
}
