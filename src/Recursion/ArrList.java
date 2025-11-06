import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    static ArrayList<Integer> indices(int []a,int n,int tar,int idx){
             if(idx>=n){
                return new ArrayList<Integer>();
             }
             //self work 
             ArrayList<Integer> ans=new ArrayList<>();
             if(a[idx]==tar){
                ans.add(idx);
             }
             //recursive work
             ArrayList<Integer> small=indices(a, n, tar, idx+1);
             ans.addAll(small);//{0,1,3} 
             return ans;
    }    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        // ArrayList<Integer> ans=indices(arr, n, c, 0);
        // for(int x:ans){
        //     System.out.println(x);
        // }
          System.out.println(indices(arr, n, c, 0));
    
       sc.close();
    }
}
