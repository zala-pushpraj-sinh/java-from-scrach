import java.util.Scanner;
public class checkfortriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three values :");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Enterd number can form a triangle");
        }
        else{
            System.out.println("Enterd number can not form a triangle");
        }
        sc.close();
    }
}
