import java.until. *;
import java.util.Scanner;
class swaping {
    public static void main(String args[])
    {
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter the num");
        a =sc.nextInt();
        System.out.println("enter second number");
        b =sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping ");
        System.out.println("First number is :"+a);
        System.out.println("Second number is"+b);
    }
}