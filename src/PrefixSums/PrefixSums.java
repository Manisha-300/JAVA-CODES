package PrefixSums;
import java.util.*;

public class PrefixSums {

    static void printarray(int [] arr){
 for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
 }}
 static int [] makePrefixSum(int [] arr){
    int n=arr.length;
    int [] pref=new int [n];
    pref[0]=arr[0];
    for(int i=0;i<n;i++){
        pref[i]=pref[i-1]+arr[i];

    }return pref;

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
        System.out.println("input array");
        printarray(arr);
        int []pref =makePrefixSum(arr);
        printarray(pref);
        sc.close();
    }
}
