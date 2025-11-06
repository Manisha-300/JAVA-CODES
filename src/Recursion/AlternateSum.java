import java.util.Scanner;

public class AlternateSum {
    public static void multiples(int n,int k){
        if(k==1) 
        {
            System.out.println(n);
            return;
        }
        multiples(n,k-1);
        System.out.println(n*k);
    }
    // static int seriessum1(int n){
    //     if(n==0) return 0;
    //     if(n%2==0){
    //     return seriessum(-1) -n;
    //     }
    //     else{
    //            return seriessum(n-1) +n;
    //     }
    // }
    static int seriessum(int n){
        if(n==0) return 0;
         if(n%2==0){
        return seriessum(n-1) -n;
        }
        else{
               return seriessum(n-1) +n;
        }
        
        
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
          multiples(n,m);
          System.out.println(seriessum(n));
         // System.out.println(seriessum1(n));
        sc.close();
    }
    
}
