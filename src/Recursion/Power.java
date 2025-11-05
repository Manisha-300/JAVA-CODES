import java.util.Scanner;

public class Power {
    static int pow(int p,int q){//time complexity O(q)
        if(q==0) return 1;//space complextiy O(q)
        return p* pow(p,q-1);
    }

    static int pow2(int a,int b){
        if(b==0) return 1;
        int small= pow2(a,b/2);
        if(b%2==0) {
            return small*small;
        }
        else{
            return a*small*small;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
           System.out.println(pow(n,m));
           System.out.println(pow2(n,m));
        sc.close();
    }
}
