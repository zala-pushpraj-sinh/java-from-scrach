import java.util.*;
public class FirstAndLastChar
{
    public static int first=-1;
    public static int last=-1;
    public static void CharIndx(String str, int len,char ch)
    {
        if(len<0)
        {
            return ;
        }
        if(str.charAt(len) == ch)
        {
            if(last== -1)
            {
                last= len;
            }
            else
            {
                first= len;
            }
        }
        CharIndx( str,len-1,ch);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.nextLine();
        System.out.println("Enter character to find:");
        char ch=sc.next().charAt(0);
        CharIndx(str, str.length()-1,ch);
        if (first == -1 && last != -1) {
            first = last;
        }
        System.out.println("First occurrence index: " + first);
        System.out.println("Last occurrence index: " + last);
        sc.close();
    }
}
