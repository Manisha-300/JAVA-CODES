import java.util.Scanner;

public class CountTriplets {
    static int Triplesum(int []arr , int tar){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==tar){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt(); 
     
        System.out.println(Triplesum(arr,tar));
        sc.close();
    }
}
