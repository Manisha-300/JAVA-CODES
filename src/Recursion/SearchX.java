import java.util.Scanner;

public class SearchX {
    static boolean search(int []a ,int n,int tar, int idx){
         if(idx>=n){
            return false;
         }
         if(a[idx]== tar){
            return true;
         }
         return  search(a,n,tar,idx+1);
        //  if(search(a,n,tar,idx+1)){
        //  return true;
        //  }
        //  else{
        //     return false;
        //  }
        // for find index 
        //if(idx)if(idx>=n){
        //     return -1;
        //  }
        //  if(a[idx]== tar){
        //     return idx;
        //  }
        //  return  search(a,n,tar,idx+1);
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    int c=sc.nextInt();
    System.out.println(search(arr,n,c,0));
       sc.close();
    }
}
