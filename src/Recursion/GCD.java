import java.util.Scanner;

public class GCD {
    static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);

    }
   public static  int igcd(int x,int y){
        while(x%y!=0){
            int rem =x%y;
            x=y;
            y=rem;

        }
        return y;
    }
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
           System.out.println(igcd(n, m));
           System.out.println(gcd(n,m));
        sc.close();
    }
}   

