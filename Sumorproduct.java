import java.util.Scanner;
class strong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int i=1;
        int sum=0;
        int p=1;
        if(c==1){
            for(i=1; i<n; i++){
                sum=sum+i;
                System.out.println(sum);

            }
        }
        else if(c==2){
            for(i=1; i<n; i++)
            p=p*i;
            System.out.println("product ="+p);
    
        }
        else{
            System.out.println(-1);
            
        }
    }

}