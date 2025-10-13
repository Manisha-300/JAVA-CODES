import java.util.*;
public class PairSum {
    static int pairsum(int []sum, int target){
        int num=sum.length;
        int ans=0;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(sum[i]+sum[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(pairsum(arr,target));
        sc.close();
    }
}