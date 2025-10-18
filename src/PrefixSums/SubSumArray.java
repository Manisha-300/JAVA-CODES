package PrefixSums;

import java.util.Scanner;

public class SubSumArray {
    static int findsum(int []arr){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            ts+=arr[i];
        }
        return ts;
    }
    static boolean equalSumPartition(int []arr){
            int totalSum=findsum(arr);
            int preSum=0;
            for(int i=0;i<arr.length;i++){
                preSum+=arr[i];
                int suffSum=totalSum-preSum;
                if(suffSum==preSum){
                    return true;
                }
            }
            return false;
    }
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  array size");
        int n=sc.nextInt();
        int [] arr =new int [n];
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("equal partition possible"+equalSumPartition(arr));
        sc.close();
    }
    
}
