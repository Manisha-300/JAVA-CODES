package Sorting;
public class SortPosNeg {
    static void partition(int[] num){
        int l = 0, r = num.length-1;
        while(l < r){
            while(num[l] < 0) l++;
            while (num[r] >= 0) r--;
            if(l < r){
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
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
        partition(arr);
        System.out.println("Array after partitioning:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
