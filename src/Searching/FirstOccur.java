package Searching;
public class FirstOccur {
     static int firstOcc(int[] a, int x){
        int n = a.length;
        int st = 0, end = n-1;
        int fo = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == x){
                fo = mid;
                end = mid-1;
            } else if(x < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return fo;
    }
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(firstOcc(arr, x));
        sc.close();
    }
}
