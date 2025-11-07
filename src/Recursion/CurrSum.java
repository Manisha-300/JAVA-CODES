import java.util.Scanner;

public class CurrSum {
    static void subsum(int []a, int n, int idx, int sum){
        //base case
        if(idx>= n){
            System.out.println(sum);
            return ;
        }



        subsum(a, n, idx+1, sum+a[idx]);
        subsum(a, n, idx+1, sum);
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // int i=sc.nextInt();
    subsum(arr, n, 0,0);
       sc.close();
    }
}
