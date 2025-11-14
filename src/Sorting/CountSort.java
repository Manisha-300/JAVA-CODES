package Sorting;
public class CountSort {
    static void countsort(int []arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        for(int i=0;i<=max;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=max;i++){
            count[i]=count[i]+count[i-1];
        }
        int output[]=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
      public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
              countsort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
