package Sorting;
public class Insertion {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {//we assume that 0 element is sorted 
           
            int j = i;

            
            while ( arr[j]<arr[j-1] && j>0) {
                //swap arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
            
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
       
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
