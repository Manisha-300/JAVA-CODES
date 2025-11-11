package Striver_Recursion;
import java.util.Scanner;

public class SubSequence {
    static void subseq(int []arr,int index,String curr){
        if (index==arr.length) {
            System.out.println(curr.trim());
            return;
            
        }
        subseq(arr, index+1, curr+arr[index]+" ");
        subseq(arr, index+1, curr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int []arr=new int [n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       subseq(arr, 0,"" );
       sc.close();
    }
    
}
