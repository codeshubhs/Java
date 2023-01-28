import java.util.*;
class Solution{
    public static void main(String[] args) {
        int n=4;
        int i,j,k;
        for(i=1; i<=n; i++){
            for(j=i-1; j<n; j++){
                System.out.print(j*2+1 +" ");
            }
            for(k=0; k<i-1; k++){
                System.out.print(k*2+1 +" ");
            }
            System.out.println();
        }
    }
}