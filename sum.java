import java.util.Scanner;
class first 

{
    public static void main (String[] args) 
    {


        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first number");
        int x=sc.nextInt();
        System.out.println(x);
        System.out.println("Enter second number");
        int y=sc.nextInt();
        System.out.println(y);
        System.out.print("happy coding");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a ="+a+" b="+b);
    }