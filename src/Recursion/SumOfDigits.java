import java.util.Scanner;

public class SumOfDigits {
    static int Sum(int n){
        if(n >= 0  && n<=9){
            return n;
        }
        // int small=Sum(n/10);
        return Sum(n/10) + n%10;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
           System.out.println(Sum(12345));
        sc.close();
    }
}
