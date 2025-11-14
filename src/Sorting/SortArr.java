package Sorting;
public class SortArr {
    
    // public static void sortedArray(int[] arr) {
    //     int n = arr.length;
    //      for (int i = 0; i < n - 1; i++) {
    //             if (arr[i] > arr[i + 1]) {
    //              //swap
    //              int temp = arr[i];
    //              arr[i] = arr[i + 1];
    //              arr[i + 1] = temp;
    //             }
    //       }
       
    // }
      static void sortArr(int[] num){
        int n = num.length;
        int x = -1, y = -1;
        if(n <= 1){ // corner case, edge case
            return;
        }
        //process all adjacent elements
        for(int i = 1; i < n; i++){
            if(num[i-1] > num[i]){
                if(x == -1){ // first conflict
                    x = i-1;
                    y = i;
                } else { // 2nd conflict
                    y = i;
                }
            }
        }
        // swap x, y in num
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortArr(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
