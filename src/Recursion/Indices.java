import java.util.Scanner;

public class Indices {
    static void find(int []a,int n,int tar,int idx){
        if(idx>=n){
            return ;
        }
        if(a[idx]==tar){
            System.out.println(idx);
        }
        find(a, n, tar, idx+1);
        
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    int c=sc.nextInt();
    find(arr,n,c,0);
       sc.close();
    }
    
}
