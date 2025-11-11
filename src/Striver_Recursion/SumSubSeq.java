package Striver_Recursion;
import java.util.Scanner;

public class SumSubSeq {
    static void sum(int[] arr, int index, int currentSum, int k, String current) {
        // Base case: if we’ve processed all elements
        if (index == arr.length) {
            if (currentSum == k) {
                System.out.println(current.trim());
            }
            return;
        }

        // Choice 1: include the current element
        sum(arr, index + 1, currentSum + arr[index], k, current + arr[index] + " ");

        // Choice 2: exclude the current element
        sum(arr, index + 1, currentSum, k, current);
    }
    public static void main(String[] args) {
        
    
   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int []arr=new int [n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       sum(arr, 0, 0, k, "");
       sc.close();
    }
}
