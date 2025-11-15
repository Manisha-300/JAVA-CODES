package Searching;
public class BinarySearch {
     static boolean binarySearch(int[] a, int target){
        int n = a.length;
        int st = 0, end = n-1; // 0 based indexing
        while(st <= end){
            int mid = (st + end)/2;
            if(target == a[mid]){
                return true;
            } else if(target < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;
    }
    static boolean recBinarySearch(int[] a, int st, int end, int target){
        if(st > end) return false; // base case
        int mid = (st + end)/2;
        if(target == a[mid]){
            return true;
        } else if (target < a[mid]){
            return recBinarySearch(a, st, mid-1, target); // subproblems
        } else {
            return recBinarySearch(a, mid+1, end, target); // subproblems
        }
    }
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        
        while(target != 10) {
            System.out.println( recBinarySearch(arr, 0, arr.length-1, target));
            System.out.println( binarySearch(arr, target));
            System.out.println();
            target++;
        sc.close();
    }
    
}
}
