import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayPermut {
      static void permute(int[] arr, int index) {
        // Base case
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
           
            swap(arr, index, i);

           
            permute(arr, index + 1);

            swap(arr, index, i);
        }
    }

   
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        permute(arr, 0);
        sc.close();
    }
}
