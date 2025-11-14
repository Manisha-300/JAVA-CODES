package Sorting;
public class Sort012 {
      static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void sort012(int[] a){
        int lo = 0, mid = 0, hi = a.length-1;
        //explore the unknown region
        while(mid <= hi){
            if(a[mid] == 0){
                swap(a, mid, lo);
                mid++;
                lo++;
            } else if(a[mid] == 1){
                mid++;
            } else {
                swap(a, mid, hi);
                hi--;
            }
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
        sort012(arr);
       
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
