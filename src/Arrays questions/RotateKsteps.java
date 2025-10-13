import java.util.Scanner;

public class RotateKsteps {
    static int [] rotate (int []arr, int k){
        int n=arr.length;
        k=k%n;
        int []res=new int [n];
        int j=0;
        for(int i=n-k;i<n;i++){
            res[j++]=arr[i];

        }
        for(int i=0;i<n-k;i++){
            res[j++]=arr[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int []ans=rotate(arr,k);
        System.out.println("array after rotating ");
        for(int i=0;i<n;i++){
            System.out.println(ans[i]+" ");
        }
        sc.close();
    }
//   inputs  34
// 56
// 76
// 87
// 32
// 56
//  output array after rotating 
// 32 
// 34 
// 56 
// 76 
// 87
}
