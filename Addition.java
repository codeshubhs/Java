import java.util.Scanner;
class Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();
        System.out.println("Addition");
        int c=x+y;
        System.out.println("sum ="+c);
        System.out.println("Subtraction");
        int z=x-y;
        System.out.println("sub ="+z);

        System.out.println("Multiplication");
        int m=x*y;
        System.out.println("multi ="+m);

        System.out.println("Division");
        int d=x/y;
        System.out.println("div ="+d);
    }
}