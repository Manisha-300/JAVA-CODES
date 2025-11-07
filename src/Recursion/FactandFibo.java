package Recursion;
import java.util.Scanner;

public class FactandFibo {
    

    static int fact(int n){
        if(n==0) return 1;
            
        int small=fact(n-1);
        int ans =small*n;
        return ans ;
       
    }
    static int  fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
            //     int prev=fibo(n-1);
    //   int prevfinal=fibo(n-2);
    //   return prev+prevfinal;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        System.out.println(fibo(n));
        sc.close();
    }
    
}
