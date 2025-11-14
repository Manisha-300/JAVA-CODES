package Sorting;
public class RadixSort {
    static int radixsort(int []arr,int n,int exp){
        int output[]=new int[n];
        int count[]=new int[10];
        for(int i=0;i<10;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
        return 0;
    }
    static void sort(int []arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int exp=1;max/exp>0;exp*=10){
            radixsort(arr,n,exp);
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
        sort(arr,n);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
